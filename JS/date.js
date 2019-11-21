var todaydate=new Date();
console.log('todays date',todaydate);
console.log('day',todaydate.getDay());
console.log('year',todaydate.getFullYear());
console.log('date',todaydate.getDate());
console.log('month',todaydate.getMonth()); 
var constMilli = new Date(0);
console.log('date',constMilli);
var constString = new Date('NOV 10');
console.log('Date string constructor',constString);
var constYear = new Date(2017,10);
console.log('Date year constructor',constYear);



