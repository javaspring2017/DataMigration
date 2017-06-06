/**
 * creation date 24.06.2016
 *
 * @author A.Hrankina
 */
(function () {
    var app = angular.module("main", ["ui.bootstrap", "utils"]);

    app.controller("MainCtrl", function ($rootScope, $scope, $compile, $element, $timeout, $http, $modal, $filter) {
        var store = this;

        /* tabs */
        store.addTab = function (name, caption, directive) {
            if ($element.find("#tabHeader_" + name).length === 0) {
                var headerHtml = '<li id="tabHeader_' + name + '"><a href="#tabContent_' + name + '" data-toggle="tab">' + caption +
                    '<button class="close" type="button" ng-click="mainCtrl.removeTab(\'' + name + '\')" title="Закрыть вкладку">×</button></a></li>';
                var headerElement = angular.element(headerHtml);
                $element.find("#pageTab").append(headerElement);
                $compile(headerElement)($scope);

                var bodyHtml = '<div style="width: 100%; height: 100%; padding: 10px" class="tab-pane" id="tabContent_' + name + '">' + directive + '</div>';
                var bodyElement = angular.element(bodyHtml);
                $element.find("#pageTabContent").append(bodyElement);
                $compile(bodyElement)($scope);
            }
            $element.find("#tabHeader_" + name + " a").click();

            store.recalcTabContentHeight();
        };

        store.removeTab = function (name) {
            var previous;
            var currentHeader = $element.find("#tabHeader_" + name)[0];
            var isCurrentActive = $element.find("#pageTab li.active")[0] === currentHeader;
            if (isCurrentActive) {
                var allHeaders = $element.find("#pageTab li");
                for (var i = 1; i < allHeaders.size(); i++) {
                    if (allHeaders[i] === currentHeader) {
                        previous = allHeaders[i - 1];
                    }
                }
            }

            $element.find("#tabHeader_" + name).remove();
            $element.find("#tabContent_" + name).remove();

            if (isCurrentActive) {
                previous.firstChild.click();
            }

            store.recalcTabContentHeight();
        };

        store.recalcTabContentHeight = function () {
            var tabHeight = $element.find("#pageTab")[0].scrollHeight;
            $element.find("#pageTabContent").css("height", "calc(100% - " + tabHeight + "px)");
        };

        $scope.showModal = false;

            /* global alerts */
        $scope.globalAlert = null;
        $rootScope.addGlobalAlert = function(aMsg, aType) {
            $scope.globalAlert = {msg: aMsg, type: aType};
        };

        $scope.$watch('globalAlert', function() {
            if (!$scope.globalAlert) {
                return;
            }
            var alert = $scope.globalAlert;
            $scope.globalAlert = null;
            $modal.open({
                templateUrl: 'js/common/global-alerts.html',
                controller: 'GlobalAlertsCtrl',
                backdrop: true,
                keyboard: true,
                backdropClick: true,
                //size: 'lg',
                resolve: {
                    data: function () {
                        return alert;
                    }
                }
            });
        });

        $scope.toggleModal = function() {
            $scope.showModal = !$scope.showModal;
            $scope.alerts.splice(0, 1);
        };

        store.initActionForm = function() {
            $scope.alerts = [];
            $scope.actionForm = {};
            $scope.actionForm.found = false;
            $scope.rawActionForm = true;
            $scope.actionLoading = false;
        };

        var onErrorActions = function () {
            $scope.actionForm.found = true;
            $scope.actionSkipassSearchLoading = false;
            $scope.rawActionForm = false;
        };

        store.sendActionRequest = function(url, paramData) {
            $scope.actionLoading = true;
            $http.post(url, paramData)
                .success(function (data) {
                    $scope.actionLoading = false;
                    store.closeActionForms();
                    $rootScope.addGlobalAlert("Действие было завершено удачно", "success");
                })
                .error(function (data) {
                    $scope.actionLoading = false;
                    store.addAlert(data.msg, "danger");
                });
        };

        store.clearActionForm = function() {
            $scope.actionForm = {};
        };

        $scope.alerts = [];
        store.addSelfCloseAlert = function (aMsg, aType) {
            var alert = aType ? {type: aType, msg: aMsg} : {msg: aMsg};
            $scope.alerts.push(alert);
            $timeout(function() {
                $scope.alerts.splice($scope.alerts.indexOf(alert), 1);
            }, 3000);
        };
        store.addAlert = function (aMsg, aType) {
            var alert = aType ? {type: aType, msg: aMsg} : {msg: aMsg};
            $scope.alerts.push(alert);
        };
        store.closeAlert = function (index) {
            $scope.alerts.splice(index, 1);
        };
    });


    app.controller("GlobalAlertsCtrl", function ($scope, $modalInstance, data) {
        $scope.data = data;
        console.log($scope.data);
        $scope.close = function () {
            $modalInstance.close();
        }
    });

    app.config(['$httpProvider', function ($httpProvider) {

        var interceptor = ["$q", function (q) {
            return {
                'response': function (response) {
                    //Will only be called for HTTP up to 302
                    //console.log(response);
                    return response;
                },
                'responseError': function (rejection) {
                    console.log(rejection);
                    if (rejection.status === 401) {
                        //console.log("oppa");
                        //TODO: msg for session expiration
                        location.reload();
                    }
                    return q.reject(rejection);
                }
            }
        }];
        $httpProvider.interceptors.push(interceptor);
    }]);
})();