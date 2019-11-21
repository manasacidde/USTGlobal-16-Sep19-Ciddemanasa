var brands = ['kingfisher','bisleri']
console.log('for loop')
for(var i=0;i<brands.length;i++){
    console.log(brands[i])
    break;
}

console.log('For of loop')
for(var elements of brands){
console.log('brands=',elements)
break;
}

console.log('For in loop')
for(var index in brands){
console.log('brands=',brands[index])
}

console.log('for in for objects')
var person={
    name:'cream',
    age:21,
    
}
for(var key in person){
    console.log('value=',person[key])
}

console.log('for each method in array')
var movies =['sholay','kgf']
movies.forEach(function(value,index){
    console.log('movie=',value)
    
})

console.log('for each of items')
var items=[{
    item:'bangles',
    id:1,
    price:100,
},
{
    item:'eyeliner',
    id:2,
    price:500,
},
{
    item:'watch',
    id:1,
    price:1000,
},
{
    item:'bike',
    id:1,
    price:100000,
},
]
items.forEach(function(item,index){
    console.log('item=',item);
    console.log('index=',index)
}
)

console.log('does not consider empty')
var num=[1,2,,4]
for(var i=0;i<num.length;i++)
{
    console.log(num[i])
}

num.forEach(function(value){
    console.log(value)
})
console.log('donot consider index')
num['hundred']=100;
for(var i=0;i<num.length;i++)
{
    console.log(num[i])
}

for (var i in num){
    console.log(num[i])
}


