package com.gonichiwa.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.gonichiwa.model.MindMapModel;
import com.gonichiwa.view.MindMapMenuBar;
import com.gonichiwa.view.MindMapToolBar;

public class MindMapMenuController {

	private MindMapMenuBar menuBar;
	private MindMapToolBar toolBar;
	private MindMapModel model;
	
	public MindMapMenuController(MindMapModel model,MindMapMenuBar menuBar,MindMapToolBar  toolBar){
		
		this.menuBar = menuBar;
		this.toolBar = toolBar;
		this.model = model;
		
		
		menuBar.addNewwListener(new newwActionListener());
		menuBar.addOpenListener(new openActionListener());
		menuBar.addSaveListener(new saveActionListener());
		menuBar.addSaveasListener(new saveasActionListener());
		menuBar.addCloseListener(new closeActionListener());
		menuBar.addExportListener(new exportActionListener());
		menuBar.addUndoListener(new undoActionListener());
		menuBar.addRedoListener(new redoActionListener());
		menuBar.addDeleteListener(new deleteActionListener());
		menuBar.addApplyListener(new applyActionListener());
		menuBar.addChangeListener(new changeActionListener());
		menuBar.addZoominListener(new zoominActionListener());
		menuBar.addZoomoutListener(new zoomoutActionListener());
		menuBar.addFitmapListener(new fitmapActionListener());
		menuBar.addHideEditorPaneListener(new hideeditorpaneActionListener());
		menuBar.addHideAttributePaneListener(new hideattributepaneActionListener());
		
		toolBar.addApplyListener(new applyActionListener());
		toolBar.addNewwListener(new newwActionListener());
		toolBar.addOpenListener(new openActionListener());
		toolBar.addSaveListener(new saveActionListener());
		toolBar.addSaveasListener(new saveasActionListener());
		toolBar.addCloseListener(new closeActionListener());
		toolBar.addChangeListener(new changeActionListener());
		toolBar.addFitmapListener(new fitmapActionListener());
		toolBar.addZoominListener(new zoominActionListener());
		toolBar.addZoomoutListener(new zoomoutActionListener());
		toolBar.addUndoListener(new undoActionListener());
		toolBar.addRedoListener(new redoActionListener());
	}
	
	public MindMapMenuController(MindMapModel model){
		this(model,new MindMapMenuBar(),new MindMapToolBar());
	}
	
	public MindMapMenuBar getMenuBar() {
		return menuBar;
	}
	public MindMapToolBar getToolBar() {
		return toolBar;
	}
	public void addApplyListener(ActionListener l) {
		menuBar.addApplyListener(l);
		toolBar.addApplyListener(l);
	}
	public void addChangeListener(ActionListener l) {
		menuBar.addChangeListener(l);
		toolBar.addChangeListener(l);
	}
	public void addDeleteListener(ActionListener l) {
		menuBar.addDeleteListener(l);
	}
	
	//make action listener later;
	
	class newwActionListener implements ActionListener{
				
		public void actionPerformed(ActionEvent e) {
			System.out.println("New");
		}
	}
	class openActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Open");
		}
	}
	class saveActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			model.saveTo("/Users/penubo/Developer/Java/", "hello");
			System.out.println("save");
		}
	}
	class saveasActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("saveas");
		}
	}
	class closeActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("close");
		}
	}
	class exportActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("export");
		}
	}
	class undoActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("undo");
		}
	}
	class redoActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("redo");
		}
	}
	class deleteActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("delete");
		}
	}
	class applyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("apply");
		}
	}
	class changeActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("change");
		}
	}
	class zoominActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("zoomin");
		}
	}
	class zoomoutActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("zoomout");
		}
	}
	class fitmapActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("fitmap");	
		}
	}
	class hideeditorpaneActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("hideeditor");
		}
	}
	class hideattributepaneActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("hideattribute");
		}
	}
	
}
