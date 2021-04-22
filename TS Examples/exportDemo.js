"use strict";
exports.__esModule = true;
var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (x, y) {
        return (x + y);
    };
    return Calculator;
}());
exports.Calculator = Calculator;
var Hello = /** @class */ (function () {
    function Hello() {
    }
    Hello.prototype.display = function () {
        console.log("display() inside Hello");
    };
    return Hello;
}());
exports.Hello = Hello;
