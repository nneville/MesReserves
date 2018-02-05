/**
 * MainController pour l'application
 * 
 * 
 */

var app = angular.module('chemin_audit', []);

var MainController = function($scope, $http, $location) {
	
	// declaration des variables
	$scope.article = '';
	$scope.reference = '3029330003533';
	
	
	$scope.findBarcode = function() {
		var promise = $http.get("https://fr.openfoodfacts.org/api/v0/produit/" + $scope.reference + ".json");
		var onSuccess = function(response) {
			$scope.article = response.data;
		}
		var onError = function(reason) {
			$scope.error = "No result found"; 
		}
		promise.then(onSuccess, onError);
	};
	
	$scope.enregistrer = function() {
		var promise = $http.get("http://localhost:8080/MesReserves/rest/dbProduct/" + $scope.reference);
		var onSuccess = function(response) {
			$scope.reponse2 = response.data;
		}
		var onError = function(reason) {
			$scope.error = "No result found"; 
		}
		promise.then(onSuccess, onError);
	};
	
}

app.controller("MainController", ["$scope", "$http", "$location", MainController]);
