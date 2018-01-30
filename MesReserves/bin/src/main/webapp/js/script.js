/**
 * MainController pour l'application
 * 
 * 
 */

var app = angular.module('chemin_audit', []);

var MainController = function($scope, $http, $location) {
	
	// declaration des variables
	$scope.typeArticle = 'S';
	$scope.formatRapport = 'pdf';
	$scope.dateAnalyse = '';
	$scope.loader = true;
	$scope.mySelect = { taille : null };
}

app.controller("MainController", ["$scope", "$http", "$location", MainController]);
