package ykk.common.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
/**
 * The persistent class for the TBL_UPLOAD database table.
 * 
 */
@Entity
@Table(name="TBL_UPLOAD")
@NamedQuery(name="Upload.findAll", query="SELECT u FROM Upload u")
public class Upload implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long uploadId;
	private String attachType;
	private Long byteNum;
	private Date createTime;
	private Long createUser;
	private String delFlag;
	private String fileExt;
	private String fileStatus;
	private Long hostId;
	private String oldName;
	private String path;
	private String remark;
	private Long seq;
	private String tableName;
	private String title;
	private Date updateTime;
	private Long updateUser;
	private String url;

	public Upload() {
	}


	@Id
	@SequenceGenerator(name="TBL_UPLOAD_UPLOADID_GENERATOR", sequenceName="SEQ_TBL_UPLOAD", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_UPLOAD_UPLOADID_GENERATOR")
	@Column(name="UPLOAD_ID")
	public Long getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(Long uploadId) {
		this.uploadId = uploadId;
	}


	@Column(name="ATTACH_TYPE")
	public String getAttachType() {
		return this.attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}


	@Column(name="BYTE_NUM")
	public Long getByteNum() {
		return this.byteNum;
	}

	public void setByteNum(Long byteNum) {
		this.byteNum = byteNum;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	@Column(name="CREATE_USER")
	public Long getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}


	@Column(name="DEL_FLAG")
	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}


	@Column(name="FILE_EXT")
	public String getFileExt() {
		return this.fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}


	@Column(name="FILE_STATUS")
	public String getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}


	@Column(name="HOST_ID")
	public Long getHostId() {
		return this.hostId;
	}

	public void setHostId(Long hostId) {
		this.hostId = hostId;
	}


	@Column(name="OLD_NAME")
	public String getOldName() {
		return this.oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}


	@Column(name="PATH")
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name="REMARK")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name="SEQ")
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}


	@Column(name="TABLE_NAME")
	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Column(name="TITLE")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	@Column(name="UPDATE_USER")
	public Long getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	@Column(name="URL")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}