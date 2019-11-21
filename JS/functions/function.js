//Named functions
function add(num1,num2)
{
    console.log('sum=',num1+num2)
}
add(10,20);

function add(num1,num2,num3)
{
    console.log('sum1=',num1+num2+num3);
}
add(10,20,30);           //NO METHOD OVERLOADING IN JS

//Function expression(Anonymous)
var sub=function(num1,num2)
{ 
    var subValue=num1-num2;
    return subValue;
}
var value=sub(90,89);
console.log('value=',value);

//SELF INVOKED FUNCTIONS
console.log('hello');
(function(num1,num2)
{
    console.log('value=',num1+num2);
})(10,20)

//FAT ARROW FUNCTIONS

var div=(num1,num2)=>
{
    console.log('value=',num1-num2);
}
div(10,5)
//2
var div1=num1=>
{
    console.log('value=',num1)
}
div1(10);
//3
var div2 = num1=>console.log('value=',num1);
div2(10);
//4
var add1 = (num1,num2)=>num1+num2;
var val = add1(10,20);

// ONLY NAMED FUNCTIONS CAN BE CALLED BEFORE DECLARED

greeting('manasa');
function greeting(msg)
{
    console.log('hello',msg)
}

//FUNCTION EXPRESSION
greeting1('cream');
var a = greeting1(msg)
{
    console.log('hello',msg);
}

//FAT ARROW

greeting('manasa')
var greeting=(msg)=>
{
    console.log('hello',msg)
}

console.log(hoist);
var hoist;

function hoisting(){
    console.log(hoistingA);
    var hoistingA;
}