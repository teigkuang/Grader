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
	 * �ж��ٸ���
	 */
	public int dGrade=3;
	/**
	 * ��ʼ�������Ƕ���
	 */
	public int beginNum=1;
	/**
	 * ���������Ƕ���
	 */
	public int plusVar=1;
	/**
	 * �ӵڼ��׶ο�ʼ
	 */
	public int beginGrade=1;

	/**
	 * �޲ι���
	 */
	public Creator() {
		super();
	}

	/**
	 * ������
	 * 
	 * @param dGrade ����
	 */
	public Creator(int dGrade) {
		super();
		this.dGrade = dGrade;
	}

	/**
	 * ������Ϳ�ʼ����Ŀ
	 * 
	 * @param dGrade ������
	 * @param beginNum ��ʼ��Ŀ
	 */
	public Creator(int dGrade, int beginNum) {
		super();
		this.dGrade = dGrade;
		this.beginNum = beginNum;
	}
	/**
	 * 
	 * @param dGrade ������
	 * @param beginNum ��ʼ��Ŀ
	 * @param plusVar ��������
	 */

	public Creator(int dGrade, int beginNum, int plusVar) {
		super();
		this.dGrade = dGrade;
		this.beginNum = beginNum;
		this.plusVar = plusVar;
	}

	/**
	 * ȫ�ι���
	 * 
	 * @param dGrade ������
	 * @param beginNum ��ʼ��Ŀ
	 * @param plusVar ��������
	 * @param beginGrade ��ʼ����
	 */
	public Creator(int dGrade, int beginNum, int plusVar, int beginGrade) {
		super();
		this.dGrade = dGrade;
		this.beginNum = beginNum;
		this.plusVar = plusVar;
		this.beginGrade = beginGrade*2+1;
	}

	/**
	 * ��ȡ���ױ�
	 * 
	 * @return
	 */
	public String getGradingForm() {
		//����һ�����������ڴ�����
		StringBuilder iBuilder=new StringBuilder();
		
		iBuilder.append("���ױ�"+"\r\n");
		iBuilder.append("������"+dGrade+"\r\n");
		iBuilder.append("��ʼ����"+beginNum+"\r\n");
		iBuilder.append("��������"+plusVar+"\r\n");
		iBuilder.append("��ʼ������"+(beginGrade-1)/2+"\r\n\r\n");
		
		//������
		int totalCount=0;
		
		//�����
		int totalIndex=0;
		
		for (int i = beginGrade-1; i < dGrade ; i++) {
			int iGrade=i/2;
			if (i%2==0) {
				iBuilder.append("׼��"+iGrade+"��\r\n");
			}else{
				iBuilder.append("����"+iGrade+"��\r\n");
			}
			//����
			for (int j = 0; j < iGrade+1; j++) {
				int iClass=j+1;
				iBuilder.append("��"+iClass+"��\r\n");
				for (int j2 = 0; j2 <= i; j2++) {
					// ��������
					int rowCount = 0;
					// ���
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
