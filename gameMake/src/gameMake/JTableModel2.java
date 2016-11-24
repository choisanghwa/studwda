package gameMake;

import javax.swing.table.AbstractTableModel;

public class JTableModel2 extends AbstractTableModel{
	public	Object[][] data = {};
	public	String[] name = {"name","time","score"};
	
	public void setData(String[][] input){
		data = input;
	}
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return name.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	
}
