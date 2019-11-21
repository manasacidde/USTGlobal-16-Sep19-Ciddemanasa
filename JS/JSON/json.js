const person = {
    name   :  'sresta',
    age    :   16,
    color  :    'white',
    address: {
        city  :  'bangalore',
        state :  'karnataka',
        pincode:  591115
    },
    hobbies : ['coding','birdwatching','singing']
}
console.log('java script person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person object',jsonObject)
const jsobject = JSON.parse(jsonObject)
console.log('js object',jsobject)
localStorage.setItem('email','billgates@gmail.com')
const emailID = localStorage.getItem('email')
console.log('EMAIL ID',emailID)
localStorage.clear()
