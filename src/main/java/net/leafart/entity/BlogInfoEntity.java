package net.leafart.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog_info")
public class BlogInfoEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer blogId;
	
	private String blogTitle;
	
	private String blogContent;
	
	private String blogKbn;
	
	private String updateName;
	
	private String deleteTime;
	
	private Timestamp createTime;
	
	private Timestamp updateTime;
	
	
	public Integer getBlogId() {
	    return blogId;
	}
	
	public void setId(Integer blogId) {
	    this.blogId = blogId;
	}
	
	public String getBlogTitle() {
		return blogTitle;
		}
	
	public void setBlogTitle(String blogTitle) {
	    this.blogTitle = blogTitle;
	}
	
	
	public String getBlogContent() {
		return blogContent;
		}
	
	public void setBlogContent(String blogContent) {
	    this.blogContent = blogContent;
	}
	
	public String getBlogKbn() {
		return blogKbn;
		}
	
	public void setBlogKbn(String blogKbn) {
	    this.blogKbn = blogKbn;
	}
	
	public String getUpdateName() {
		return updateName;
		}
	
	public void setUpdateName(String updateName) {
	    this.updateName = updateName;
	}
	
	public String getDeleteTime() {
		return deleteTime;
		}
	
	public void setDeleteTime(String deleteTime) {
	    this.deleteTime = deleteTime;
	}
	
	public Timestamp getCreateTime() {
		return createTime;
		}
	
	public void setCreateTime(Timestamp createTime) {
	    this.createTime = createTime;
	}
	
	public Timestamp getUpdateTime() {
		return updateTime;
		}
	
	public void setUpdateTime(Timestamp updateTime) {
	    this.updateTime = updateTime;
	}
	}

	


