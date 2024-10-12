-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2023 at 08:16 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `password`
--

CREATE TABLE `password` (
  `ID` int(10) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `password`
--

INSERT INTO `password` (`ID`, `Username`, `Password`) VALUES
(1, 'tt', '123'),
(2, 'Thivanka Abeyasingha', 'Di$cover@024924545'),
(3, 'TMA', '123456'),
(4, 'Admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `passwordt`
--

CREATE TABLE `passwordt` (
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passwordt`
--

INSERT INTO `passwordt` (`Username`, `Password`) VALUES
('1', '123456'),
('33655', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `primarystudent`
--

CREATE TABLE `primarystudent` (
  `SID` int(15) NOT NULL,
  `Firstname` varchar(225) NOT NULL,
  `Lastname` varchar(225) NOT NULL,
  `NIC` varchar(225) NOT NULL,
  `DOB` date NOT NULL,
  `Tpno` int(10) NOT NULL,
  `Address` text NOT NULL,
  `Class` varchar(225) NOT NULL,
  `Year` int(4) NOT NULL,
  `Gender` varchar(225) NOT NULL,
  `S1` varchar(225) NOT NULL,
  `S2` varchar(225) NOT NULL,
  `S3` varchar(225) NOT NULL,
  `S4` varchar(225) NOT NULL,
  `S5` varchar(225) NOT NULL,
  `S6` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `primarystudent`
--

INSERT INTO `primarystudent` (`SID`, `Firstname`, `Lastname`, `NIC`, `DOB`, `Tpno`, `Address`, `Class`, `Year`, `Gender`, `S1`, `S2`, `S3`, `S4`, `S5`, `S6`) VALUES
(1, 'Thivanka Mihiranga', 'Abeyasingha', '200123800947', '2001-08-25', 716341300, 'Nuwara Eliya ', '1-A', 2007, 'Male', 'Sinhala', 'Maths', 'Environment', 'English', 'Religeon', 'Tamil'),
(2, 'Lawan', 'Nisura', '200134523988', '2001-11-22', 716445897, 'Nuwara Eliya ', '1-A', 2007, 'Male', 'Sinhala', 'Maths', 'Environment', 'English', 'Religeon', 'Tamil');

-- --------------------------------------------------------

--
-- Table structure for table `psm`
--

CREATE TABLE `psm` (
  `SID` varchar(255) NOT NULL,
  `Addmission` int(11) NOT NULL,
  `S1M` int(11) NOT NULL,
  `S1G` varchar(255) NOT NULL,
  `S2M` int(11) NOT NULL,
  `S2G` varchar(255) NOT NULL,
  `S3M` int(11) NOT NULL,
  `S3G` varchar(255) NOT NULL,
  `S4M` int(11) NOT NULL,
  `S4G` varchar(255) NOT NULL,
  `S5M` int(11) NOT NULL,
  `S5G` varchar(255) NOT NULL,
  `S6M` int(11) NOT NULL,
  `S6G` varchar(255) NOT NULL,
  `Total` int(11) NOT NULL,
  `AVG` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `psm`
--

INSERT INTO `psm` (`SID`, `Addmission`, `S1M`, `S1G`, `S2M`, `S2G`, `S3M`, `S3G`, `S4M`, `S4G`, `S5M`, `S5G`, `S6M`, `S6G`, `Total`, `AVG`) VALUES
('1 Thivanka Mihiranga', 7406789, 75, 'A', 81, 'A', 65, 'B', 75, 'A', 45, 'D', 47, 'D', 388, 64.666664),
('2 Lawan', 98874456, 87, 'A', 71, 'B', 64, 'C', 54, 'D', 44, 'W', 34, 'W', 354, 59);

-- --------------------------------------------------------

--
-- Table structure for table `secoundrystudent`
--

CREATE TABLE `secoundrystudent` (
  `SID` int(20) NOT NULL,
  `Fname` varchar(255) NOT NULL,
  `Lname` varchar(255) NOT NULL,
  `NIC` varchar(255) NOT NULL,
  `DOB` varchar(255) NOT NULL,
  `Tpno` int(10) NOT NULL,
  `Address` text NOT NULL,
  `Class` varchar(255) NOT NULL,
  `Year` int(4) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `S1` varchar(255) NOT NULL,
  `S2` varchar(255) NOT NULL,
  `S3` varchar(255) NOT NULL,
  `S4` varchar(255) NOT NULL,
  `S5` varchar(255) NOT NULL,
  `S6` varchar(255) NOT NULL,
  `S7` varchar(255) NOT NULL,
  `S8` varchar(255) NOT NULL,
  `S9` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `secoundrystudent`
--

INSERT INTO `secoundrystudent` (`SID`, `Fname`, `Lname`, `NIC`, `DOB`, `Tpno`, `Address`, `Class`, `Year`, `Gender`, `S1`, `S2`, `S3`, `S4`, `S5`, `S6`, `S7`, `S8`, `S9`) VALUES
(1, 'Thivanka Mihiranga', 'Abeyasingha', '200123800947', '2001.08.25', 716341300, 'Nuwara Eliya ', '6-C', 2013, 'Male', 'Sinhala', 'Maths', 'Science', 'History', 'English', 'Buddisum', 'Geogropy', 'Music', 'ICT'),
(2, 'kasuni', 'Umandika', '20025689784', '2002.03.07', 715689774, 'Kandapola', '6-B', 2014, 'Female', 'Sinhala', 'Maths', 'Science', 'History', 'English', 'Buddisum', 'Civic', 'Music', 'ICT');

-- --------------------------------------------------------

--
-- Table structure for table `seniorstudent`
--

CREATE TABLE `seniorstudent` (
  `SID` int(10) NOT NULL,
  `Fname` varchar(255) NOT NULL,
  `Lname` varchar(255) NOT NULL,
  `NIC` varchar(12) NOT NULL,
  `DOB` date NOT NULL,
  `Tpno` int(10) NOT NULL,
  `Address` text NOT NULL,
  `Class` varchar(255) NOT NULL,
  `Year` int(4) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `S1` varchar(255) NOT NULL,
  `S2` varchar(255) NOT NULL,
  `S3` varchar(255) NOT NULL,
  `S4` varchar(255) NOT NULL,
  `S5` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seniorstudent`
--

INSERT INTO `seniorstudent` (`SID`, `Fname`, `Lname`, `NIC`, `DOB`, `Tpno`, `Address`, `Class`, `Year`, `Gender`, `S1`, `S2`, `S3`, `S4`, `S5`) VALUES
(1, 'Thivanka Mihiranga', 'Abeyasingha', '200123800947', '2001-08-25', 716341300, 'Nuwara Eliya', '12-M', 2020, 'Male', 'Physics', 'I.C.T', 'Combined Maths', 'English', 'GIT'),
(2, 'Tharindu Saranga', 'Abeyasingha', '952581040V', '1995-09-14', 713703303, 'Jaffna', '12-S', 2014, 'Male', 'Physics', 'Chemistry', 'Biology', 'English', 'GIT');

-- --------------------------------------------------------

--
-- Table structure for table `ssm`
--

CREATE TABLE `ssm` (
  `SID` varchar(255) NOT NULL,
  `Addmission` int(255) NOT NULL,
  `S1M` int(11) NOT NULL,
  `S1G` varchar(255) NOT NULL,
  `S2M` int(11) NOT NULL,
  `S2G` varchar(255) NOT NULL,
  `S3M` int(11) NOT NULL,
  `S3G` varchar(255) NOT NULL,
  `S4M` int(11) NOT NULL,
  `S4G` varchar(255) NOT NULL,
  `S5M` int(11) NOT NULL,
  `S5G` varchar(255) NOT NULL,
  `Total` int(11) NOT NULL,
  `AVG` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ssm`
--

INSERT INTO `ssm` (`SID`, `Addmission`, `S1M`, `S1G`, `S2M`, `S2G`, `S3M`, `S3G`, `S4M`, `S4G`, `S5M`, `S5G`, `Total`, `AVG`) VALUES
('2 Tharindu Saranga', 56987748, 65, 'B', 85, 'A', 78, 'A', 62, 'C', 73, 'B', 363, 72.6),
('1 Thivanka Mihiranga', 73833240, 91, 'A', 41, 'S', 55, 'C', 55, 'C', 56, 'C', 298, 59.6);

-- --------------------------------------------------------

--
-- Table structure for table `ssm2`
--

CREATE TABLE `ssm2` (
  `SID` varchar(255) NOT NULL,
  `Addmission` int(255) NOT NULL,
  `S1M` int(11) NOT NULL,
  `S1G` varchar(255) NOT NULL,
  `S2M` int(11) NOT NULL,
  `S2G` varchar(255) NOT NULL,
  `S3M` int(11) NOT NULL,
  `S3G` varchar(255) NOT NULL,
  `S4M` int(11) NOT NULL,
  `S4G` varchar(255) NOT NULL,
  `S5M` int(11) NOT NULL,
  `S5G` varchar(255) NOT NULL,
  `S6M` int(11) NOT NULL,
  `S6G` varchar(255) NOT NULL,
  `S7M` int(11) NOT NULL,
  `S7G` varchar(255) NOT NULL,
  `S8M` int(11) NOT NULL,
  `S8G` varchar(255) NOT NULL,
  `S9M` int(11) NOT NULL,
  `S9G` varchar(255) NOT NULL,
  `Total` int(11) NOT NULL,
  `AVG` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ssm2`
--

INSERT INTO `ssm2` (`SID`, `Addmission`, `S1M`, `S1G`, `S2M`, `S2G`, `S3M`, `S3G`, `S4M`, `S4G`, `S5M`, `S5G`, `S6M`, `S6G`, `S7M`, `S7G`, `S8M`, `S8G`, `S9M`, `S9G`, `Total`, `AVG`) VALUES
('1 Thivanka Mihiranga', 65, 56, 'C', 65, 'B', 56, 'C', 89, 'A', 78, 'A', 89, 'B', 56, 'C', 66, 'A', 78, 'A', 633, 70.333336),
('2 kasuni', 22455, 71, 'B', 98, 'A', 89, 'A', 91, 'A', 45, 'S', 65, 'B', 85, 'A', 98, 'A', 45, 'S', 687, 76.333336);

-- --------------------------------------------------------

--
-- Table structure for table `teacherdetails`
--

CREATE TABLE `teacherdetails` (
  `TID` int(10) NOT NULL,
  `Fname` varchar(225) NOT NULL,
  `Lname` varchar(225) NOT NULL,
  `NIC` varchar(12) NOT NULL,
  `DOB` date NOT NULL,
  `Tpno` int(10) NOT NULL,
  `Address` text NOT NULL,
  `subjectosection` varchar(225) NOT NULL,
  `Year` int(4) NOT NULL,
  `Gender` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacherdetails`
--

INSERT INTO `teacherdetails` (`TID`, `Fname`, `Lname`, `NIC`, `DOB`, `Tpno`, `Address`, `subjectosection`, `Year`, `Gender`) VALUES
(1, 'Lakmali Sewwandi', 'Arundhika', '976881156V', '1997-05-14', 756698477, 'Polonnaruwa', 'Primary', 2020, 'Female'),
(2, 'sandaru', 'sathsara', '982556874V', '1998-10-25', 716589774, 'colombo', 'music', 2020, 'Male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `password`
--
ALTER TABLE `password`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `passwordt`
--
ALTER TABLE `passwordt`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `primarystudent`
--
ALTER TABLE `primarystudent`
  ADD PRIMARY KEY (`SID`);

--
-- Indexes for table `psm`
--
ALTER TABLE `psm`
  ADD PRIMARY KEY (`Addmission`);

--
-- Indexes for table `secoundrystudent`
--
ALTER TABLE `secoundrystudent`
  ADD PRIMARY KEY (`SID`);

--
-- Indexes for table `seniorstudent`
--
ALTER TABLE `seniorstudent`
  ADD PRIMARY KEY (`SID`);

--
-- Indexes for table `ssm`
--
ALTER TABLE `ssm`
  ADD PRIMARY KEY (`Addmission`);

--
-- Indexes for table `ssm2`
--
ALTER TABLE `ssm2`
  ADD PRIMARY KEY (`Addmission`);

--
-- Indexes for table `teacherdetails`
--
ALTER TABLE `teacherdetails`
  ADD PRIMARY KEY (`TID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `password`
--
ALTER TABLE `password`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
