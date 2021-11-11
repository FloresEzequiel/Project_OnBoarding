/*
    1) This robot roams around a 2D grid. It starts at (0, 0) facing North. After each time it moves, 
    the robot rotates 90 degrees clockwise. Given the amount the robot has moved each time, you have to 
    calculate the robot's final position. To illustrate, if the robot is given the movements 20, 30, 10, 40 
    then it will move:
        20 steps North, now at (0, 20)
        30 steps East, now at (30, 20)
        10 steps South. now at (30, 10)
        40 steps West, now at (-10, 10)
        ...and will end up at coordinates (-10, 10).
    Examples:
        trackRobot(20, 30, 10, 40) ➞ [-10, 10]

        trackRobot() ➞ [0, 0]
        // No movement means the robot stays at (0, 0).

        trackRobot(-10, 20, 10) ➞ [20, -20]
        // The amount to move can be negative.
    Notes
        Each movement is an integer (whole number).

*/

function trackRobot(...move){
    var position = 0;
    var x = 0;
    var y = 0;
    for(let i=0; i<move.length;i++){

        if(i%2==0){
            if(position==0){
                
                y=y+move[i];
                position=1;
            }
            if(position==2){
                y=y-move[i];
                position=3;
            }

            
        }else{
            if(position==1){
                x=x+move[i];
                position=2;
            }
            if(position==3){
                x=x-move[i];
                position=0;
            }

        }
    }
    var array = [x,y];
    return array;
}

console.log(trackRobot(20,30,10,40));
console.log(trackRobot());
console.log(trackRobot(-10, 20, 10));