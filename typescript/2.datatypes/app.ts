let myName:string="manasa";
console.log(myName,typeof myName);

let age:number;
console.log(age,typeof age);

let mblnumber=4567;
console.log(mblnumber,typeof mblnumber);

let address;
address="aaa";
address=1123;
console.log(address,typeof address);

let calAge=function():void{
    console.log("age is 21");
}
calAge();

class Person{
    constructor(public name:string,public age:number){

    }

}
let person1=new Person('manasa',21)
console.log(person1);

class Student extends Person{
    constructor(name:string,age:number,public rollnumber:number){
        super(name,age);
    }
}
let Student1=new Student('navya',21,408);
console.log(Student1);