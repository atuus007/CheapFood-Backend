function Fasz($scope, $http) {
    alert("I am an alert box!fasfdasfsadfasfasdfasdf");
    console.log("Wallet address generation success!")
    $http.get('http://localhost:8080/CheapFood/foodslist.json').
    success(function(data) {
        $scope.foodslist = data;
    });
}