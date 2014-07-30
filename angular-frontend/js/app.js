(function() {
    var app = angular.module("myapp", []);

    app.controller("MovieController", ['$http', function($http) {
        var holder = this;
        holder.movie = [];
        $http.get("http://localhost:8080").success(function(data) {
            holder.movie = data;
        });
    }]);
})();