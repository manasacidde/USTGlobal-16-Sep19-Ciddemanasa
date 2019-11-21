var car = ['bmw','audi']
for(var i=0;i<car.length;i++)
{
    console.log(car[i])
}
for(var elements of car)
{
    console.log('car=',elements)
}
for(var index in car){
    console.log('car=',car[index])
}
car.forEach(function(value,index){
    console.log('car=',value)
})
var places=['hyd','ban']
for(var i=0;i<places.length;i++)
{
    console.log(places[i])
}
for(var elements of places)
{
    console.log('places=',elements)
}
for(var index in places){
    console.log('places=',places[index])
}
car.forEach(function(value,index){
    console.log('places=',value)
})

var devices=['tv','ac']
for(var i=0;i<devices.length;i++)
{
    console.log(devices[i])
}
for(var elements of devices)
{
    console.log('devices=',elements)
}
for(var index in devices){
    console.log('devices=',devices[index])
}
car.forEach(function(value,index){
    console.log('devices=',value)
})
var mobile=['redmi','oppo']
for(var i=0;i<mobile.length;i++)
{
    console.log(mobile[i])
}
for(var elements of mobile)
{
    console.log('mobile=',elements)
}
for(var index in mobile){
    console.log('mobile=',car[index])
}
car.forEach(function(value,index){
    console.log('mobile=',value)
})
var lang=['c','java']
for(var i=0;i<lang.length;i++)
{
    console.log(lang[i])
}
for(var elements of lang)
{
    console.log('lang=',elements)
}
for(var index in lang){
    console.log('lang=',lang[index])
}
lang.forEach(function(value,index){
    console.log('lang=',value)
})
var flowers=['rose','jasmine']
for(var i=0;i<flowers.length;i++)
{
    console.log(flowers[i])
}
for(var elements of flowers)
{
    console.log('flowers=',elements)
}
for(var index in flowers){
    console.log('flowers=',flowers[index])
}
flowers.forEach(function(value,index){
    console.log('flowers=',value)
})
var ids=[10,20,30]
for(var i=0;i<ids.length;i++)
{
    console.log(ids[i])
}
for(var elements of ids)
{
    console.log('ids=',elements)
}
for(var index in ids){
    console.log('ids=',ids[index])
}
ids.forEach(function(value,index){
    console.log('ids=',value)
})
var sub=['maths','science']
for(var i=0;i<sub.length;i++)
{
    console.log(sub[i])
}
for(var elements of sub)
{
    console.log('sub=',elements)
}
for(var index in sub){
    console.log('sub=',sub[index])
}
sub.forEach(function(value,index){
    console.log('sub=',value)
})

var cou=['india','aus']
for(var i=0;i<cou.length;i++)
{
    console.log(cou[i])
}
for(var elements of cou)
{
    console.log('cou=',elements)
}
for(var index in cou){
    console.log('cou=',cou[index])
}
cou.forEach(function(value,index){
    console.log('cou=',value)
})

console.log('for each of items')
var places=[{
    item:'bang',
    id:1,
    
},
{
    item:'hyd',
    id:2,
    
},
{
    item:'mumbai',
    id:3,
    
},
{
    item:'delhi',
    id:4,
    
},
]
places.forEach(function(item,index){
    console.log('item=',places);
    console.log('index=',index)
}
)