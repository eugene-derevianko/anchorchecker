angular.module('hello', []).controller('home', function($http) {
  var self = this;
  self.test = "A";
  $http.get('resource').then(function(response) {
    self.greeting = response.data;
    self.test = "T";
  })
});