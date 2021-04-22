var Employee = /** @class */ (function () {
    function Employee(name, age) {
        this.name = name;
        this.age = age;
    }
    Employee.prototype.display = function () {
        console.log("Name = " + this.name + ", Age = " + this.age);
    };
    return Employee;
}());
var e = new Employee("Alex", 33);
e.display();
