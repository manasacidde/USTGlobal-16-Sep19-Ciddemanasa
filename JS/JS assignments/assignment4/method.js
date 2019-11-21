const item = [{
    name:'ear ring',
    id:1,
    price:5000
},
{
    name:'kajal',
    id:2,
    price:500
},
{
    name:'bike',
    id:1,
    price:50000
},
{
    name:'beardo',
    id:1,
    price:170
},
]
const  item1=item.map(function(value,index)
{
 value.price=value.price+300;
 return value;
})
// fat arrow
// item.map(value=>{
//     value.price=value.price+300;
//     return value
// })

console.log(item1)

const max=item.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max)

// fat arrow
// const z=item.filter(value=>value.price>1000
// )

const car = [{
    name:'bmw',
    id:1,
    price:50000
},
{
    name:'audi',
    id:2,
    price:100000
},
{
    name:'kiya',
    id:1,
    price:50000
},

]
const  item2=car.map(function(value,index)
{
 value.price=value.price+300;
 return value;
})
console.log(item2)

const max1=item.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max1)

const mobile = [{
    name:'oppo',
    id:1,
    price:50000
},
{
    name:'redmi',
    id:2,
    price:10000
},
{
    name:'vivo',
    id:1,
    price:50000
},

]
const  item3 = mobile.map(function(value,index)
{
 value.price = value.price+300;
 return value;
})
console.log(item3)

const max2 = mobile.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max2)

const flowers = [{
    name:'lotus',
    id:1,
    price:50
},
{
    name:'rose',
    id:2,
    price:10
},
{
    name:'lilly',
    id:1,
    price:20
},
]
const  item4=flowers.map(function(value,index)
{
 value.price = value.price+300;
 return value;
})
console.log(item4)

const max3=flowers.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max3)

const fruits = [{
    name:'apple',
    id:1,
    price:50
},
{
    name:'banana',
    id:2,
    price:10
},
{
    name:'orange',
    id:1,
    price:20
},
]
const  item5 = fruits.map(function(value,index)
{
 value.price = value.price+300;
 return value;
})
console.log(item5)

const max4 = fruits.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max4)

const devices = [{
    name:'tv',
    id:1,
    price:20000
},
{
    name:'mobile',
    id:2,
    price:10000
},
{
    name:'ac',
    id:1,
    price:30000
},
]
const  item6 = devices.map(function(value,index)
{
 value.price = value.price+300;
 return value;
})
console.log(item6)

const max5 = devices.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max5)


const books = [{
    name:'science',
    id:1,
    price:200
},
{
    name:'maths',
    id:2,
    price:100
},
{
    name:'social',
    id:1,
    price:300
},
]
const  item7 = books.map(function(value,index)
{
 value.price = value.price+300;
 return value;
})
console.log(item7)

const max6 = books.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max6)

const  movies= [{
    name:'akil',
    id:1,
    price:200
},
{
    name:'abc',
    id:2,
    price:100
},
{
    name:'style',
    id:1,
    price:300
},
]
const  item8 = movies.map(function(value,index)
{
 value.price = value.price+300;
 return value;
})
console.log(item8)

const max7 = movies.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max7)

const films = [{
    name:'orange',
    id:1,
    price:100
},
{
    name:'racha',
    id:2,
    price:100
},
{
    name:'yevadu',
    id:1,
    price:300
},
]
const  item9 = films.map(function(value,index)
{
 value.price = value.price+300;
 return value;
})
console.log(item9)

const max8 = films.filter(function(value,index){
    if(value.price>5000)
    {
        return true;

    }
    else{
        return false;
    }
})
console.log(max8)


