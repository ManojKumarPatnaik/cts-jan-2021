var items = ["Alex", "Bruce", "Charles", "David"];
// old approach
items.forEach(function(item, index){
    console.log(item +" at index no. "+index);
});
console.log("-------------")
// new approach
items.forEach((item, index) => console.log(item+" at index: "+index));
// more than one line of statement needs {} 
console.log("--------------")
items.forEach((item, index) => {
 console.log("forEach is iterating "+index);
 console.log("Item: "+item);
});