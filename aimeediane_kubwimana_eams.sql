-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 19, 2024 at 10:44 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `aimeediane_kubwimana_eams`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) NOT NULL,
  `password` int(170) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'tilo', 123);

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE IF NOT EXISTS `attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_code` int(11) NOT NULL,
  `date` varchar(110) NOT NULL,
  `time_in` varchar(110) NOT NULL,
  `time_out` varchar(116) NOT NULL,
  `workedhours` varchar(170) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `employee_code`, `date`, `time_in`, `time_out`, `workedhours`) VALUES
(1, 2020, '12/2/2021', '8:00', '5:00', '8'),
(2, 100, '12/2/2002', '8:00', '5:00', '8');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `employee_code` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(130) NOT NULL,
  `address` varchar(150) NOT NULL,
  `status` varchar(200) NOT NULL,
  PRIMARY KEY (`employee_code`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employee_code`, `firstname`, `lastname`, `phone`, `email`, `address`, `status`) VALUES
(7, 'hirwa', 'peter', '0987654', 'peter@gmail.com', 'kigali', 'manager'),
(8, 'keza', 'migy', '098765', 'migy@gmail.com', 'kigali', 'admin'),
(9, 'mutoni', 'nadia', '098765', 'mutoninadia@gmail.com', 'huye', 'manager'),
(10, 'kagabo', 'peter', '09876', 'peter@gmail.com', 'kgl', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `holiday`
--

CREATE TABLE IF NOT EXISTS `holiday` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(210) NOT NULL,
  `holidaytype` varchar(120) NOT NULL,
  `startdate` varchar(120) NOT NULL,
  `enddate` varchar(130) NOT NULL,
  `document` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

--
-- Dumping data for table `holiday`
--

INSERT INTO `holiday` (`id`, `employee_name`, `holidaytype`, `startdate`, `enddate`, `document`) VALUES
(1, 'fina', 'wertyui', 'dfghj', 'zxcvgh', 'zdfg'),
(2, 'vcx', 'bgfds', '10/02', '12/09', 'nhgf'),
(30, 'hhhh', 'hgf', '1/09', '12/10', 'mnhgfd');

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE IF NOT EXISTS `notification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(210) NOT NULL,
  `type` varchar(120) NOT NULL,
  `content` varchar(120) NOT NULL,
  `status` varchar(130) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `notification`
--

INSERT INTO `notification` (`id`, `employee_name`, `type`, `content`, `status`) VALUES
(1, 'keza', ',kjhgf', 'mxmjhx', 'nxb');

-- --------------------------------------------------------

--
-- Table structure for table `permision`
--

CREATE TABLE IF NOT EXISTS `permision` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(210) NOT NULL,
  `reason _for _leave` varchar(120) NOT NULL,
  `date` varchar(120) NOT NULL,
  `time _for _leave` varchar(130) NOT NULL,
  `time _for _back` varchar(150) NOT NULL,
  `reason _type` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `permision`
--

INSERT INTO `permision` (`id`, `employee_name`, `reason _for _leave`, `date`, `time _for _leave`, `time _for _back`, `reason _type`) VALUES
(1, 'aerty', 'cvb', '12/09', '12:00', '5:00', 'hgfd');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE IF NOT EXISTS `registration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `address` varchar(120) NOT NULL,
  `email` varchar(130) NOT NULL,
  `username` varchar(150) NOT NULL,
  `password` varchar(200) NOT NULL,
  `hireddate` varchar(190) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `name`, `phone`, `address`, `email`, `username`, `password`, `hireddate`) VALUES
(1, 'uwera phanny', '078908765', 'kigali', 'uwera@gmail.com', 'phanny', '123', '12/09/2021'),
(5, 'ishimwe fidela', '0987654', 'karongi', 'ishimwe@gmail.com', 'mpundu', '123aa', '12/1/2021'),
(6, 'bampire', '0987654', 'kenya', 'bampire@gmail.com', 'teddy', 'sdfgh', '12/2/2021'),
(7, 'jhgf', '098765', 'mjhg', 'mjhgf', 'aa', '12', '12/09'),
(12, 'zxcvb', 'zxcvb', 'mjhgfdjhgfd', 'nhgfdszjhgf', 'bgfdszz', 'nahvgcn', 'abgfd'),
(15, 'keza', '098765', 'nnhg', 'mhg', 'coco', '123', '12/12'),
(20, 'akineza', '098765', 'kenya', 'akineza@gmail.com', 'keza', '12', '12/09/1990');
