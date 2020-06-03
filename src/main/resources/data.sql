--
-- Dumping data for table `answer_status`
--

LOCK TABLES `answer_status` WRITE;
/*!40000 ALTER TABLE `answer_status` DISABLE KEYS */;
INSERT INTO `answer_status` VALUES (1,_binary '',NULL,'2020-06-02 15:44:45',NULL,'2020-06-02 15:44:45','Right'),(2,_binary '',NULL,'2020-06-02 15:44:55',NULL,'2020-06-02 15:44:55','Wrong'),(3,_binary '',NULL,'2020-06-02 15:45:05',NULL,'2020-06-02 15:45:05','Partial');
/*!40000 ALTER TABLE `answer_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
INSERT INTO `assignment` VALUES (1,_binary '',NULL,'2020-06-02 15:37:51',NULL,'2020-06-02 15:37:51','Assignment 3');
/*!40000 ALTER TABLE `assignment` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,_binary '',NULL,'2020-06-02 15:34:54',NULL,'2020-06-02 15:34:54','Answer for question 01','Description for question 01',50,'Question 1',1),(2,_binary '',NULL,'2020-06-02 15:35:25',NULL,'2020-06-02 15:35:25','Answer for question 02','Description for question 02',60,'Question 2',1),(3,_binary '',NULL,'2020-06-02 15:35:47',NULL,'2020-06-02 15:35:47','Answer for question 03','Description for question 03',80,'Question 3',1);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES (1,_binary '',NULL,'2020-06-02 15:51:06',NULL,'2020-06-02 15:51:06',2,400,1,1),(2,_binary '',NULL,'2020-06-02 15:51:33',NULL,'2020-06-02 15:51:33',5,300,3,2),(3,_binary '',NULL,'2020-06-02 15:51:42',NULL,'2020-06-02 15:51:42',5,211,2,3);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,_binary '',NULL,'2020-06-02 15:31:46',NULL,'2020-06-02 15:31:46',24,'Grade 5','Tom Hardy',NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `student_assignments`
--

LOCK TABLES `student_assignments` WRITE;
/*!40000 ALTER TABLE `student_assignments` DISABLE KEYS */;
INSERT INTO `student_assignments` VALUES (1,1);
/*!40000 ALTER TABLE `student_assignments` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `student_results`
--

LOCK TABLES `student_results` WRITE;
/*!40000 ALTER TABLE `student_results` DISABLE KEYS */;
INSERT INTO `student_results` VALUES (1,1),(1,2),(1,3);
/*!40000 ALTER TABLE `student_results` ENABLE KEYS */;
UNLOCK TABLES;


