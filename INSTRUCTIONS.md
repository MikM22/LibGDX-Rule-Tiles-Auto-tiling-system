
# Instructions: 
Create a text file alongside your spritesheet that contains all the possible images of the Rule Tile. This text file will define what neighboring tiles must be present for that image to appear in the Rule Tile.
The file must be formatted starting with the coordinates of the image whose rules you are defining and then the 3x3 grid of neighbors. If you want to say that the image at [0,0] in the spritesheet should appear if there are tiles touching its edges, you would put:

[0,0]  
oxo  
x-x  
oxo  

'o' represents no neighbor is there in the grid, 'x' represents there is a neighbor there, and '-' represents that it doesn't matter whether a neighbor is there or not.

There is also a shorthand to rotate this ruleset 90 degrees 4 times, and to flip it horizontally or vertically. That is notated by adding 'R', 'H', or 'V' after the image coordinates. For example: 

[3,0]R  
xxx  
o-o  
ooo  

This would be identical to: 

[3,0]  
xxx  
o-o  
ooo  
[3,0]  
oox  
o-x  
oox  
[3,0]  
ooo  
o-o  
xxx  
[3,0]  
xoo  
x-o  
xoo  

In the example folder is an example metadata file and corresponding spritesheet. There is also an example class which shows how to add the Rule Tiles to your tilemap renderer.
