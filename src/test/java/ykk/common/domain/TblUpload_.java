package ykk.common.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-01T16:31:02.711+0800")
@StaticMetamodel(Upload.class)
public class TblUpload_ {
	public static volatile SingularAttribute<Upload, Long> uploadId;
	public static volatile SingularAttribute<Upload, String> attachType;
	public static volatile SingularAttribute<Upload, Long> byteNum;
	public static volatile SingularAttribute<Upload, Date> createTime;
	public static volatile SingularAttribute<Upload, Long> createUser;
	public static volatile SingularAttribute<Upload, String> delFlag;
	public static volatile SingularAttribute<Upload, String> fileExt;
	public static volatile SingularAttribute<Upload, String> fileStatus;
	public static volatile SingularAttribute<Upload, Long> hostId;
	public static volatile SingularAttribute<Upload, String> oldName;
	public static volatile SingularAttribute<Upload, String> path;
	public static volatile SingularAttribute<Upload, String> remark;
	public static volatile SingularAttribute<Upload, Long> seq;
	public static volatile SingularAttribute<Upload, String> tableName;
	public static volatile SingularAttribute<Upload, String> title;
	public static volatile SingularAttribute<Upload, Date> updateTime;
	public static volatile SingularAttribute<Upload, Long> updateUser;
	public static volatile SingularAttribute<Upload, String> url;
}
