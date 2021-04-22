class Employee { 
    
    constructor(private name : string, private age : number) {
    }
    display() : void {
        console.log("Name = "+this.name+", Age = "+this.age);
    }
}
let e = new Employee("Alex", 33);
e.display();