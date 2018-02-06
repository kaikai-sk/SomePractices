package com.sk.space;
public class Solution 
{
    public String replaceSpace(StringBuffer str) 
    {
    	int blankNum=0;
    	int strLength=str.length();
    	int newLenght=0;
    	if(str==null)
    	{
    		return null;
    	}
    	for(int i=0;i<str.length();i++)
    	{
    		if(str.charAt(i)==' ')
    		{
    			blankNum++;
    		}
    	}
    	
    	newLenght=strLength+2*blankNum;
    	char[] charSeq=new char[newLenght];
    	int index=newLenght-1;
    	for(int i=strLength-1;i>=0;i--)
    	{
    		if(str.charAt(i)==' ')
    		{
    			charSeq[index--]='0';
    			charSeq[index--]='2';
    			charSeq[index--]='%';
    		}
    		else
    		{
				charSeq[index--]=str.charAt(i);
			}
    	}
    	return new String(charSeq);
    }
}