-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: localhost    Database: giit
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `book_title` varchar(30) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `date_of_printing` varchar(20) DEFAULT NULL,
  `author` varchar(15) DEFAULT NULL,
  `press` varchar(15) DEFAULT NULL,
  `category` char(1) DEFAULT NULL,
  `unit_price` float DEFAULT NULL,
  PRIMARY KEY (`book_title`,`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('Effective JAVA','1561315135213','2008','Joshua Bloch','工业出版社','A',88);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bussiness_info`
--

DROP TABLE IF EXISTS `bussiness_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bussiness_info` (
  `Bunumber` varchar(20) NOT NULL,
  `CaseNumber` varchar(20) NOT NULL,
  `BuSTime` datetime NOT NULL,
  `BuOTime` datetime NOT NULL,
  `BuPName` varchar(50) NOT NULL,
  `BuPDesc` varchar(200) DEFAULT NULL,
  `BuODesc` varchar(200) DEFAULT NULL,
  `BuPupload` varchar(20) DEFAULT NULL,
  `Isend` varchar(20) NOT NULL,
  PRIMARY KEY (`Bunumber`),
  KEY `CaseNumber` (`CaseNumber`),
  CONSTRAINT `bussiness_info_ibfk_1` FOREIGN KEY (`CaseNumber`) REFERENCES `case_info` (`CaseNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bussiness_info`
--

LOCK TABLES `bussiness_info` WRITE;
/*!40000 ALTER TABLE `bussiness_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `bussiness_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `case_info`
--

DROP TABLE IF EXISTS `case_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `case_info` (
  `CaseNumber` varchar(20) NOT NULL,
  `Actorname` varchar(20) NOT NULL,
  `Casesrc` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Telname` varchar(20) NOT NULL,
  `Tel` varchar(30) NOT NULL,
  `Landtel` varchar(30) NOT NULL,
  `Casecharger` varchar(20) NOT NULL,
  `Casetime` datetime NOT NULL,
  `Casedesc` varchar(20) NOT NULL,
  `Freecut` varchar(20) NOT NULL,
  `According` varchar(20) NOT NULL,
  `Fileupload` varchar(20) NOT NULL,
  `Cutnumber` varchar(20) NOT NULL,
  `DpNo` varchar(20) NOT NULL,
  `Userid` varchar(20) NOT NULL,
  PRIMARY KEY (`CaseNumber`),
  KEY `Cutnumber` (`Cutnumber`),
  KEY `DpNo` (`DpNo`),
  KEY `Userid` (`Userid`),
  CONSTRAINT `case_info_ibfk_1` FOREIGN KEY (`Cutnumber`) REFERENCES `freecutting` (`Cutnumber`),
  CONSTRAINT `case_info_ibfk_2` FOREIGN KEY (`DpNo`) REFERENCES `departmentinfo` (`DpNo`),
  CONSTRAINT `case_info_ibfk_3` FOREIGN KEY (`Userid`) REFERENCES `userinfo` (`Userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `case_info`
--

LOCK TABLES `case_info` WRITE;
/*!40000 ALTER TABLE `case_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `case_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class` (
  `class_id` varchar(30) NOT NULL,
  `class_name` varchar(10) DEFAULT NULL,
  `year` varchar(20) DEFAULT NULL,
  `spec_name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES ('161111',NULL,'20161','网络工程');
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `course_title` varchar(30) NOT NULL,
  `type` varchar(10) DEFAULT NULL,
  `credits` float DEFAULT NULL,
  `speciality` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`course_title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('网络技术','必修课/公共课',4,'网络工程');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dealinfo`
--

DROP TABLE IF EXISTS `dealinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dealinfo` (
  `HandleID` varchar(20) NOT NULL,
  `CaseNumber` varchar(20) NOT NULL,
  `Adepartment` varchar(20) NOT NULL,
  `Steps` varchar(20) NOT NULL,
  PRIMARY KEY (`HandleID`),
  KEY `CaseNumber` (`CaseNumber`),
  CONSTRAINT `dealinfo_ibfk_1` FOREIGN KEY (`CaseNumber`) REFERENCES `recordinformation` (`CaseNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dealinfo`
--

LOCK TABLES `dealinfo` WRITE;
/*!40000 ALTER TABLE `dealinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `dealinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'管理系'),(2,'信息工程系'),(3,'机电系');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departmentinfo`
--

DROP TABLE IF EXISTS `departmentinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departmentinfo` (
  `DpNo` varchar(20) NOT NULL,
  `Dpname` varchar(20) NOT NULL,
  `Dpadress` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`DpNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departmentinfo`
--

LOCK TABLES `departmentinfo` WRITE;
/*!40000 ALTER TABLE `departmentinfo` DISABLE KEYS */;
INSERT INTO `departmentinfo` VALUES ('1','test','sichuan');
/*!40000 ALTER TABLE `departmentinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fileinfos`
--

DROP TABLE IF EXISTS `fileinfos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fileinfos` (
  `Fileid` varchar(50) NOT NULL,
  `FileOname` varchar(200) NOT NULL,
  `FileNname` varchar(200) NOT NULL,
  `FileEname` varchar(10) NOT NULL,
  `Filetime` datetime NOT NULL,
  `type` varchar(20) NOT NULL,
  `id` varchar(20) NOT NULL,
  PRIMARY KEY (`Fileid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fileinfos`
--

LOCK TABLES `fileinfos` WRITE;
/*!40000 ALTER TABLE `fileinfos` DISABLE KEYS */;
/*!40000 ALTER TABLE `fileinfos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `freecutting`
--

DROP TABLE IF EXISTS `freecutting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `freecutting` (
  `Cutnumber` varchar(20) NOT NULL,
  `Cutname` varchar(20) NOT NULL,
  `CutExpress` varchar(200) NOT NULL,
  `IlligalDesc` varchar(200) NOT NULL,
  PRIMARY KEY (`Cutnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `freecutting`
--

LOCK TABLES `freecutting` WRITE;
/*!40000 ALTER TABLE `freecutting` DISABLE KEYS */;
INSERT INTO `freecutting` VALUES ('1','test','1','1'),('2','test','1','1');
/*!40000 ALTER TABLE `freecutting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_book`
--

DROP TABLE IF EXISTS `order_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_book` (
  `staff_id` varchar(30) NOT NULL,
  `sec_id` int(11) NOT NULL,
  `book_title` varchar(30) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `remark` varchar(30) DEFAULT NULL,
  `approval` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`staff_id`,`sec_id`,`book_title`,`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_book`
--

LOCK TABLES `order_book` WRITE;
/*!40000 ALTER TABLE `order_book` DISABLE KEYS */;
INSERT INTO `order_book` VALUES ('teacher',1,'Effective JAVA','1561315135213','不要二手',1);
/*!40000 ALTER TABLE `order_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `punishment`
--

DROP TABLE IF EXISTS `punishment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `punishment` (
  `Itemid` varchar(20) NOT NULL,
  `Itemname` varchar(20) NOT NULL,
  `Itemcate` varchar(20) NOT NULL,
  `Department` varchar(20) NOT NULL,
  `punishtype` varchar(20) NOT NULL,
  `Punishstandard` varchar(20) NOT NULL,
  PRIMARY KEY (`Itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `punishment`
--

LOCK TABLES `punishment` WRITE;
/*!40000 ALTER TABLE `punishment` DISABLE KEYS */;
INSERT INTO `punishment` VALUES ('1','test','1','test','test','test'),('2','12','121','21','121','12');
/*!40000 ALTER TABLE `punishment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recordinformation`
--

DROP TABLE IF EXISTS `recordinformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recordinformation` (
  `CaseNumber` varchar(20) NOT NULL,
  `Userid` varchar(20) NOT NULL,
  `Casetitle` varchar(20) NOT NULL,
  `Parties` varchar(20) NOT NULL,
  `Casesource` varchar(11) NOT NULL,
  `Casename` varchar(20) NOT NULL,
  `Recordtime` datetime NOT NULL,
  `Crimereports` varchar(20) NOT NULL,
  `According` varchar(20) NOT NULL,
  `Fileupload` varchar(20) NOT NULL,
  `Casemold` varchar(20) NOT NULL,
  `Cutnumber` varchar(20) NOT NULL,
  `DpNo` varchar(20) NOT NULL,
  `CurrentstaUis` varchar(20) NOT NULL,
  PRIMARY KEY (`CaseNumber`),
  KEY `Cutnumber` (`Cutnumber`),
  KEY `DpNo` (`DpNo`),
  KEY `Userid` (`Userid`),
  CONSTRAINT `recordinformation_ibfk_1` FOREIGN KEY (`Cutnumber`) REFERENCES `freecutting` (`Cutnumber`),
  CONSTRAINT `recordinformation_ibfk_2` FOREIGN KEY (`DpNo`) REFERENCES `departmentinfo` (`DpNo`),
  CONSTRAINT `recordinformation_ibfk_3` FOREIGN KEY (`Userid`) REFERENCES `userinfo` (`Userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recordinformation`
--

LOCK TABLES `recordinformation` WRITE;
/*!40000 ALTER TABLE `recordinformation` DISABLE KEYS */;
INSERT INTO `recordinformation` VALUES ('1','asd','1','1','12','sadf','2011-11-11 00:00:00','test','1','1','1','1','1','Yes'),('2','asd','1','1','1','1','2011-11-11 00:00:00','1','1','1','1','1','1','1');
/*!40000 ALTER TABLE `recordinformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recordlnformation`
--

DROP TABLE IF EXISTS `recordlnformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recordlnformation` (
  `CaseNumber` varchar(20) NOT NULL,
  `Userid` varchar(20) NOT NULL,
  `Casetitle` varchar(20) NOT NULL,
  `Parties` varchar(20) NOT NULL,
  `Casesource` varchar(11) NOT NULL,
  `Casename` varchar(20) NOT NULL,
  `Recordtime` datetime NOT NULL,
  `Crimereports` varchar(20) NOT NULL,
  `According` varchar(20) NOT NULL,
  `Fileupload` varchar(20) NOT NULL,
  `Casemold` varchar(20) NOT NULL,
  `Cutnumber` varchar(20) NOT NULL,
  `DpNo` varchar(20) NOT NULL,
  `CurrentstaUis` varchar(20) NOT NULL,
  PRIMARY KEY (`CaseNumber`),
  KEY `Cutnumber` (`Cutnumber`),
  KEY `DpNo` (`DpNo`),
  KEY `Userid` (`Userid`),
  CONSTRAINT `recordlnformation_ibfk_1` FOREIGN KEY (`Cutnumber`) REFERENCES `freecutting` (`Cutnumber`),
  CONSTRAINT `recordlnformation_ibfk_2` FOREIGN KEY (`DpNo`) REFERENCES `departmentinfo` (`DpNo`),
  CONSTRAINT `recordlnformation_ibfk_3` FOREIGN KEY (`Userid`) REFERENCES `userinfo` (`Userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recordlnformation`
--

LOCK TABLES `recordlnformation` WRITE;
/*!40000 ALTER TABLE `recordlnformation` DISABLE KEYS */;
/*!40000 ALTER TABLE `recordlnformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resource`
--

DROP TABLE IF EXISTS `resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(100) DEFAULT NULL,
  `permission` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_resource_parent_id` (`parent_id`),
  KEY `idx_resource_parent_ids` (`parent_ids`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resource`
--

LOCK TABLES `resource` WRITE;
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `resource_ids` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_role_resource_ids` (`resource_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin','管理员','',1),(5,NULL,NULL,NULL,0),(6,'administrator','行政人员',NULL,0),(7,'individual','个体',NULL,0),(8,'corportation','企业',NULL,0);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section`
--

DROP TABLE IF EXISTS `section`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `section` (
  `sec_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_title` varchar(15) DEFAULT NULL,
  `year` varchar(5) DEFAULT NULL,
  `limitCount` int(11) DEFAULT NULL,
  `staff_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sec_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section`
--

LOCK TABLES `section` WRITE;
/*!40000 ALTER TABLE `section` DISABLE KEYS */;
INSERT INTO `section` VALUES (1,'网络技术','20161',8,'teacher');
/*!40000 ALTER TABLE `section` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serviceinformation`
--

DROP TABLE IF EXISTS `serviceinformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `serviceinformation` (
  `BuNumber` varchar(20) NOT NULL,
  `CaseNumber` varchar(20) NOT NULL,
  `BuSTime` datetime NOT NULL,
  `BuOTime` datetime NOT NULL,
  `BuPName` varchar(50) NOT NULL,
  `BuPDesc` varchar(200) DEFAULT NULL,
  `BuODesc` varchar(200) DEFAULT NULL,
  `BuPupload` varchar(20) DEFAULT NULL,
  `Casewhether` varchar(20) NOT NULL,
  `type` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`BuNumber`),
  KEY `CaseNumber` (`CaseNumber`),
  CONSTRAINT `serviceinformation_ibfk_1` FOREIGN KEY (`CaseNumber`) REFERENCES `recordinformation` (`CaseNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serviceinformation`
--

LOCK TABLES `serviceinformation` WRITE;
/*!40000 ALTER TABLE `serviceinformation` DISABLE KEYS */;
INSERT INTO `serviceinformation` VALUES ('1','1','2011-01-01 00:00:00','2011-02-02 00:00:00','2','1','1','1','1',NULL),('2','1','2011-01-01 00:00:00','2011-02-02 00:00:00','1','12','1','1','No','review');
/*!40000 ALTER TABLE `serviceinformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `speciality`
--

DROP TABLE IF EXISTS `speciality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `speciality` (
  `spec_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(10) DEFAULT NULL,
  `spec_name` varchar(15) DEFAULT NULL,
  `year` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`spec_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `speciality`
--

LOCK TABLES `speciality` WRITE;
/*!40000 ALTER TABLE `speciality` DISABLE KEYS */;
INSERT INTO `speciality` VALUES (1,'信息工程系','网络工程',NULL);
/*!40000 ALTER TABLE `speciality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff` (
  `staff_id` varchar(30) NOT NULL,
  `staff_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES ('lzc','lzc'),('teacher','teacher');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `student_id` varchar(30) NOT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `id_card` varchar(20) DEFAULT NULL,
  `year` varchar(5) DEFAULT NULL,
  `class_id` varchar(10) DEFAULT NULL,
  `telephone_number` varchar(20) DEFAULT NULL,
  `student_origin_base` varchar(10) DEFAULT NULL,
  `gender` varchar(4) DEFAULT NULL,
  `pic_path` varchar(45) DEFAULT NULL,
  `leave_of_absence` tinyint(1) DEFAULT NULL,
  `leave_school` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `takes`
--

DROP TABLE IF EXISTS `takes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `takes` (
  `student_id` varchar(30) NOT NULL,
  `sec_id` varchar(30) NOT NULL,
  `score` float DEFAULT NULL,
  PRIMARY KEY (`student_id`,`sec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `takes`
--

LOCK TABLES `takes` WRITE;
/*!40000 ALTER TABLE `takes` DISABLE KEYS */;
INSERT INTO `takes` VALUES ('student','1',5),('student2','1',5);
/*!40000 ALTER TABLE `takes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timetable` (
  `sec_id` int(11) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `weeks` varchar(20) DEFAULT NULL,
  `week` varchar(20) DEFAULT NULL,
  `classroom` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable`
--

LOCK TABLES `timetable` WRITE;
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` varchar(30) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `role_ids` varchar(100) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `idx_user_username` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('admin','3ab82b226b3b60f4eab8cd0a88887ba0','cd0faf6f821809044e35e35fd23cf44a','1',0),('individual','39318ea817c605d52ab3a42ec43818f4','3392382bd3417e05fc475b11517c1214','7',0),('lzc','d7237944e3cac49e8f4f6b122af39736','c852384c9a06745efedb4a16cbcf7af9','2,3',0),('student','5476883b25e9c7bb0528b6fdfa0f5de7','20d98880380112ff6404bdcaa4ba9c10','2',0),('student2','5476883b25e9c7bb0528b6fdfa0f5de7','20d98880380112ff6404bdcaa4ba9c10','2',0),('supplier','19a885f6627571598621fe5f5e9cbbc5','9c64193184d34fa04a205d06b93ca3d6','4',0),('teacher','f7e7844cad9aadb0c7f1722f2c9be050','a7bbf832a7472759146b0967a78e6ce5','3',0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userinfo` (
  `Userid` varchar(20) NOT NULL,
  `Roleid` varchar(20) NOT NULL,
  `DpNo` varchar(20) NOT NULL,
  `LevelNo` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `CPassword` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `People` varchar(20) DEFAULT NULL,
  `Cellphone` varchar(11) DEFAULT NULL,
  `Mobilephone` varchar(20) DEFAULT NULL,
  `IDCardNo` char(18) NOT NULL,
  `Usrname` varchar(20) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Department` varchar(20) DEFAULT NULL,
  `beizhu` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` VALUES ('asd','ad','ad','ad}','ads','ad','ad','ads','ad','ad','12121212121212121','sa','qwe','wqe','qwe}',''),('qwe','qwe','we','qwe','qwe','qwe','qwe','qwe','qqwe','qwe','qwe','qwe','qwe','qwe','qwe','qwe');
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-15 11:44:29
