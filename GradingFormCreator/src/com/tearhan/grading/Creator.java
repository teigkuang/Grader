package com.tearhan.grading;

/**
 * Creator This class is a grading form creator use a StringBuilder to get the
 * information
 * 
 * @author teigkuang@163.com
 * 
 */
public class Creator {
	/**
	 * 有多少个组
	 */
	public int dGrade=3;
	/**
	 * 开始的数字是多少
	 */
	public int beginNum=1;
	/**
	 * 递增的数是多少
	 */
	public int plusVar=1;
	/**
	 * 从第几阶段开始
	 */
	public int beginGrade=1;

	/**
	 * 无参构造
	 */
	public Creator() {
		super();
	}

	/**
	 * 含级别
	 * 
	 * @param dGrade 级别
	 */
	public Creator(int dGrade) {
		super();
		this.dGrade = dGrade;
	}

	/**
	 * 含级别和开始的数目
	 * 
	 * @param dGrade 级别数
	 * @param beginNum 开始数目
	 */
	public Creator(int dGrade, int beginNum) {
		super();
		this.dGrade = dGrade;
		this.beginNum = beginNum;
	}
	/**
	 * 
	 * @param dGrade 级别数
	 * @param beginNum 开始数目
	 * @param plusVar 增加数量
	 */

	public Creator(int dGrade, int beginNum, int plusVar) {
		super();
		this.dGrade = dGrade;
		this.beginNum = beginNum;
		this.plusVar = plusVar;
	}

	/**
	 * 全参构造
	 * 
	 * @param dGrade 级别数
	 * @param beginNum 开始数目
	 * @param plusVar 增加数量
	 * @param beginGrade 开始级别
	 */
	public Creator(int dGrade, int beginNum, int plusVar, int beginGrade) {
		super();
		this.dGrade = dGrade;
		this.beginNum = beginNum;
		this.plusVar = plusVar;
		this.beginGrade = beginGrade*2+1;
	}

	/**
	 * 获取进阶表
	 * 
	 * @return
	 */
	public String getGradingForm() {
		//定义一个变量，用于储存表格
		StringBuilder iBuilder=new StringBuilder();
		
		iBuilder.append("进阶表"+"\r\n");
		iBuilder.append("阶数："+dGrade+"\r\n");
		iBuilder.append("起始数："+beginNum+"\r\n");
		iBuilder.append("增加量："+plusVar+"\r\n");
		iBuilder.append("起始阶数："+(beginGrade-1)/2+"\r\n\r\n");
		
		//总数量
		int totalCount=0;
		
		//总组次
		int totalIndex=0;
		
		for (int i = beginGrade-1; i < dGrade ; i++) {
			int iGrade=i/2;
			if (i%2==0) {
				iBuilder.append("准第"+iGrade+"阶\r\n");
			}else{
				iBuilder.append("正第"+iGrade+"阶\r\n");
			}
			//级别
			for (int j = 0; j < iGrade+1; j++) {
				int iClass=j+1;
				iBuilder.append("第"+iClass+"级\r\n");
				for (int j2 = 0; j2 <= i; j2++) {
					// 单组数量
					int rowCount = 0;
					// 组次
					int rowIndex = j2 + 1;
					for (int k = 0; k <= iGrade; k++) {
						int iCount= beginNum+(k+j)*plusVar;
						iBuilder.append("(" + iCount + ")");
						rowCount += iCount;
					}
					if (i % 2 == 0) {
						for (int k =  iGrade - 1; k >= 0; k--) {
							int iCount= beginNum+(k+j)*plusVar;
							iBuilder.append("(" + iCount + ")");
							rowCount += iCount;
						}
					} else {
						for (int k = iGrade; k >= 0; k--) {
							int iCount= beginNum+(k+j)*plusVar;
							iBuilder.append("(" + iCount + ")");
							rowCount += iCount;
						}

					}
					totalCount += rowCount;
					totalIndex += 1;
					iBuilder.append("  [" + totalCount + ":" + rowCount + "]["
							+ rowIndex + ":" + totalIndex + "]\r\n");
				}
			}
			
		}
		
		
		
		
		String s=iBuilder.toString();
		return s;
	}

	public int getdGrade() {
		return dGrade;
	}

	public void setdGrade(int dGrade) {
		this.dGrade = dGrade;
	}

	public int getBeginNum() {
		return beginNum;
	}

	public void setBeginNum(int beginNum) {
		this.beginNum = beginNum;
	}

	public int getPlusVar() {
		return plusVar;
	}

	public void setPlusVar(int plusVar) {
		this.plusVar = plusVar;
	}

	public int getBeginGrade() {
		return beginGrade;
	}

	public void setBeginGrade(int beginGrade) {
		this.beginGrade = beginGrade;
	}

}
