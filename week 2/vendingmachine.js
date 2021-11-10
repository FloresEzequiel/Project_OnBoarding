/*
    2) Your task is to create a function that simulates a vending machine.
    Given an amount of money (in cents $ to make it simpler) and a productNumber,
    the vending machine should output the correct product name and give back the 
    correct amount of change.

    The coins used for the change are the following: [500, 200, 100, 50, 20, 10]

    The return value is an object with 2 properties:
    - product: the product name that the user selected.
    - change: an array of coins (can be empty, must be sorted in descending order).
    Examples:
        -vendingMachine(products, 200, 7) --> { product: "Crackers", change: [ 50, 20, 10 ] }

        -vendingMachine(products, 500, 0) --> "Enter a valid product number"

        -vendingMachine(products, 90, 1) --> "Not enough money for this product"

        Notes:
        - If 'productNumber' is invalid (out of range) you should return the string: "Enter a valid product number".
        - If 'money' is not enough to buy a certain product you should return the string: "Not enough money for this product".
        - If there's no change, return an empty array as the 'change'.

*/

function vending(money,productN){
    //var arrC = [500,200,100,50,20,10];
    var arrCC=[10,20,50,100,200,500];
    var arrP = ["Fritos","Hershey","Doritos","5-gum","Lays","Pepsi","Crackers"];
    var arrPC=[300,100,240,70,350,1500,120];
    var change =[];
    for(i=0;i<arrPC.length;i++){

        if(i==productN-1){
            var product = arrP[i];//return name
            var cost = arrPC[i];
            if(money<cost){
                var notE = "Not enough money for this product";
                return notE;
            }
            money=money-cost;
           // return arrP[i];
           for(j=0; j<arrCC.length;j++){
               //console.log(money)
               if(arrCC[j]<=money){
                   change.push(arrCC[j]);
                   money = money-arrCC[j];
               }
               else if(arrCC.length>j&&money!=0){
                   j=0;
               }
           }
           change.sort(function(a,b){return b-a});         
           return ['Product: '+product,'Change: '+change];
        }

    }

    var notF = "Enter a valid product number";
    return notF;
}

console.log(vending(200,7));
console.log(vending(500,0));
console.log(vending(90,1));
