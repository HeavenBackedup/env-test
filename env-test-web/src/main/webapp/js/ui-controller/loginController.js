
/**
 * Created by shj on 16-9-27.
 */
app.controller('loginController', function ($scope, loginService) {
    $scope.init = function () {
        var user = {};
        user.account = null;
        user.password = null;
        $scope.user = user;
    }

    $scope.login = function () {
        loginService.login($scope.user,function (result) {
            $scope.ajaxRollback(result,function () {
                alert(result.data);
            },function () {
                alert(result.data);
            })
        })
    }

    $scope.ajaxRollback = function (result,success,failed,otherwise) {
        if(result.code=='0'){
            if($.isFunction(success)){
                success();
            }

        }else if(result.code=='-1'){
            if($.isFunction(failed)){
                failed();
            }

        }else {
            if($.isFunction(otherwise)){
                otherwise(params);
            }

        }

    }

})