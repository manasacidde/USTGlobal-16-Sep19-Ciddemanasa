const message = new Promise(function(resolve,reject){
    if(30>20){
        resolve('success')
    }else{
        reject('failure')
    }
})
message.then(function(msg){
    console.log('success message',msg)
}).catch(function(error){
    console.log('failure message',error)
})
const emp = new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name :'Billgates',
            age:67},
    {
        name:'Jeff bezos',
        age:50
    
    
        }])
    }else{
        reject('failure')
    }
})
emp.then(function(data){
    console.log('emp details',data)
}).catch(function(error){
    console.log('failure message',error)
})

//closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(10)
console.log(innerFunc)
let counter = innerFunc()
console.log('counter value',counter)