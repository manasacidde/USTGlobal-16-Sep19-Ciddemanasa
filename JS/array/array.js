const hobbies = ['sleeping','cricket','songs']
console.log(hobbies)
console.log(typeof hobbies);
const isArrayOrNot = Array.isArray(hobbies)
console.log('hobbies array or not',isArrayOrNot);
const hasCricket = hobbies.includes('cricket')
console.log('using includes method',hasCricket)
hobbies.push('guitar','singing')
console.log('after push',hobbies)
hobbies.pop()
console.log('after pop',hobbies)
hobbies.unshift('dancing','numismatics')
console.log('after unshift method',hobbies)
hobbies.shift()
console.log('after shift method',hobbies)

const hobbies1 = ['sleeping','cricket','eating','coding','roaming']  
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const afterslice = hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterslice)
const indexOfCoding = hobbies1.indexOf('coding',2)
console.log('index of coding',indexOfCoding)
const string = hobbies1.join('-')
console.log('string is',string)


const numbers = [100,200,300,400]
const num1 = numbers.map(function(value)
{
    let newValue = value+50;
    return newValue;
})
console.log('after map method',num1)

//using fat arrow function
const num2 = numbers.map(value=>value+500)
console.log('after fat arrow',num2)

const filterNum =numbers.filter(function(value,index){
    if(value>200){
        return true;
    }
    else{
        return false
    }
})
console.log('after filter method',filterNum)
const filterNumArrow = numbers.filter(value=>value>200)
console.log('after filterarrow method',filterNumArrow)
