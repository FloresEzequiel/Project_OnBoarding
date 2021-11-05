/*
    2) Write a function that mimics (without the use of >>) the right shift operator 
    and returns the result from the two given integers.
    Examples
        shiftToRight(80, 3) --> 10
        shiftToRight(-24, 2) --> -6
        shiftToRight(-5, 1) --> -3
        shiftToRight(4666, 6) --> 72
        shiftToRight(3777, 6) --> 59
        shiftToRight(-512, 10) --> -1
    Notes
        -There will be no negative values for the second parameter y.
        -This challenge is more like recreating of the right shift operation, thus, the use of the operator directly is prohibited.
*/

function rShift(numb1,numb2){
    var array =[];
    let x =(numb1>>>0).toString(2);
    for(i=0;i<x.length;i++){
        array.push(x.substring(i,i+1));
    }
        if(Math.sign(numb1)==-1){
            
            if(array[0]=="0"){
                for(j =0; j<numb2;j++){
                    array.unshift("0");
                    array.pop();
                    }
            }else{
                for(j =0; j<numb2;j++){
                    array.unshift("1");
                    array.pop();
                    }
            }

            var res=array.toString();
            for(m=0;m<res.length;m++){
            res=res.replace(",","");
            }
            var result = ~~parseInt(res,2);
            return result;

        }else{
            
            for(j =0; j<numb2;j++){

            array.pop();
            }
            var res=array.toString();

            for(m=0;m<res.length;m++){
            res=res.replace(",","");
            }

            var result= parseInt(res, 2).toString(10);
            return result;
            }

}

console.log(rShift(80, 3));
console.log(rShift(-24, 2));
console.log(rShift(-5, 1));
console.log(rShift(4666, 6));
console.log(rShift(3777, 6));
console.log(rShift(-512, 10));




//var xxx = ~~parseInt('11111111111111111111111111111010',2);
//console.log(xxx);
