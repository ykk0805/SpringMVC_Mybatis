package ykk.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ykk.common.domain.Upload;


public interface UploadDao extends JpaRepository<Upload, Long>,
JpaSpecificationExecutor<Upload>{

}
