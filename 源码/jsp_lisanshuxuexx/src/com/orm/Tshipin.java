package com.orm;

/**
 * TDoc generated by MyEclipse Persistence Tools
 */

public class Tshipin
{

	// Fields

	private String id;

	private String title;
	
	private String content;

	private String fujian;

	private String fujianYuanshiming;
	
	private String shijian;
	
	private String del;

	// Constructors

	/** default constructor */
	public Tshipin()
	{
	}


	public String getContent()
	{
		return content;
	}


	public void setContent(String content)
	{
		this.content = content;
	}


	public String getTitle()
	{
		return title;
	}


	public String getShijian()
	{
		return shijian;
	}


	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}


	public String getFujian()
	{
		return this.fujian;
	}

	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}

	public String getFujianYuanshiming()
	{
		return this.fujianYuanshiming;
	}

	public void setFujianYuanshiming(String fujianYuanshiming)
	{
		this.fujianYuanshiming = fujianYuanshiming;
	}

	public String getDel()
	{
		return this.del;
	}


	public void setDel(String del)
	{
		this.del = del;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}


}