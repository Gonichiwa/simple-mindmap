# 1. Write node text with hierarchy in text area #
User can write name of a node. 
Name can't include tab.

__Hierarchy__ >> 
User can build hierarchy of nodes using only tab.
User can only have one root node.
User is allowed to build child node only if there is a parent node.
User can have empty node.

# 2. Press apply Button in text editor pane #
User can draw new mind map into mind map pane when user press __apply__ button in text editor pane.
If there are some errors in text area, program only throws an error message box.
After user got an error message from __apply__ button, program draws boxes next to every line of the text and fill red inside boxes which are next to the problem lines. So user can recognize and fix it.

# 3. Select nodes in mind map pane #
User can select a node with left click of the mouse. We call this state as __selected__ state of the node.
During the __selected__ state, user can see special dots around the node.
Mouse will change its shape properly according to its location of the special dots.
User can change size of the __selected__ node by dragging the special dot around it.
During changing the size of the node, user can see extended line as a dotted line form.
User can change the position of the __selected__ node by dragging the body of it, not special dot.
During changing the position of the node, user may see dotted line dynamically, according to its new position with other nodes.
User can delete a __selected__ node pressing delete button. 
If user delete a parent node, then its children will delete as well.
If User delete __selected__ node, program automatically updates the Text Area properly.
If user move mouse over the node, its boundary will change for user to recognize it. we call this state as __pointed__ state of the node.

# 4. Adjust attributes in attribute pane #
User can change some attributes of the node in attribute pane.
User can change position : __X__, __Y__ , size : __W__, __H__ and __COLOR__ of the node.
User can not change the __X__, __Y__ and __W__, __H__ values for nagative or too big values to draw.
User can change __COLOR__ using either color picker or text field.

# 5. Press change Button in attribute pane #
User can apply all modifications to mindmap pane pressing __change__ button after modification in attribute pane.
If user modify attribute values overrange, they will be constraint values. 
 
# 6. Save file #
User can save mind map data as __json__ format.
User can save mind map data no matter what errors there are.

# 7. Open file #
User can load mind map data which is chosen by finder.
The loaded data will be displayed exactly same as before even if there were errors in Text Pane.

# 8. Select Menu Bar #
Menu bar has three components __File__, __Edit__, __View__

__File__ >> New, Open, Save, Save As.., Close, Export To..

__Edit__ >> Undo, Redo, Delete, Apply, Change

__View__ >> Zoom In, Zoom Out, Fit Map, Hide Editor Pane, Hide Attribute Pane

# 9. New file #
User can make empty mind map data.
If there is any work in progress, program throws select box that is asking user want to save.

# 10. Exit #
User can shut down this program.
If there is any work in progress, program throws select box that is asking user want to save.

# 11. Tool Bar #
Tool Bar has function buttons.

New, Open, Save, Save As.., Close, Apply text pane,  Apply attribute pane, Zoom In, Zoom Out,Fit Map, Undo, Redo

# 12. Fit Map #
User can fit mind map, according to current Mind Map Pane size, using __Fit Map__.
If there is no map, then nothing happen.
if pane is not square, map will fit into one of which small height or width.

# 13. Undo #
User can restore the very previous state of the mind map using Undo.
it will only work based on mind map data hence,
Undo won't work for text Area and attribute pane unless User change the mind map data.

# 14. Redo #
User can come back from Undo state using Redo. 
it will only work based on mind map data hence,
Redo won't work for textArea and attribute pane unless User change the mind map data.


