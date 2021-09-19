-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 19, 2021 at 06:02 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aeropuerto_campanero_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_airline`
--

CREATE TABLE `tb_airline` (
  `id` int(11) NOT NULL,
  `code_airline` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(250) NOT NULL,
  `id_airport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airline`
--

INSERT INTO `tb_airline` (`id`, `code_airline`, `name`, `address`, `id_airport`) VALUES
(1, '1001', 'Travel-World', 'Address airline', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_airline_staff`
--

CREATE TABLE `tb_airline_staff` (
  `id` int(11) NOT NULL,
  `id_airline_staff` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `user_staff` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password_staff` varchar(200) NOT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airline_staff`
--

INSERT INTO `tb_airline_staff` (`id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `id_airline`) VALUES
(1, '0', 'Stiven', 'Atis', '0', 'stiven@aerolinea.com', 'user', 'sFgSHi+uAtw=', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_airport`
--

CREATE TABLE `tb_airport` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airport`
--

INSERT INTO `tb_airport` (`id`, `name`, `address`) VALUES
(1, 'El Campanero', 'Pasto');

-- --------------------------------------------------------

--
-- Table structure for table `tb_airport_staff`
--

CREATE TABLE `tb_airport_staff` (
  `id` int(11) NOT NULL,
  `id_Airport_staff` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `user_staff` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password_staff` varchar(200) NOT NULL,
  `id_airport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airport_staff`
--

INSERT INTO `tb_airport_staff` (`id`, `id_Airport_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `id_airport`) VALUES
(3, '0', 'Stiven', 'Atis', '0', 'stiven@elcampanero.com', 'Stiven', 'sFgSHi+uAtw=', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_arrival`
--

CREATE TABLE `tb_arrival` (
  `id` int(11) NOT NULL,
  `code_arrival` varchar(15) NOT NULL,
  `id_flight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_departure`
--

CREATE TABLE `tb_departure` (
  `id` int(11) NOT NULL,
  `code_departure` varchar(15) NOT NULL,
  `id_flight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight`
--

CREATE TABLE `tb_flight` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(15) NOT NULL,
  `type_flight` varchar(100) NOT NULL,
  `flight_selection` varchar(100) NOT NULL,
  `crew_plane` varchar(100) NOT NULL,
  `destination` varchar(250) NOT NULL,
  `runway` varchar(50) DEFAULT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight`
--

INSERT INTO `tb_flight` (`id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `id_airline`) VALUES
(2, 'A001', 'Vuelo de pasajeros', 'Vuelo de llegada', 'Piloto', 'Tokio', 'pista - 01A', '2022-06-26', '19:00:00', 1),
(3, 'A003', 'Vuelo de carga', 'Vuelo de salida', 'piloto y copiloto', 'Bogota', 'pista - 012B', '2023-01-05', '02:40:00', 1),
(4, 'A004', 'Vuelo de carga', 'Vuelo de salida', 'piloto y copiloto', 'Berlin', 'pista - 012B', '2022-01-10', '16:00:00', 1),
(21, 'A002', 'Vuelo de carga', 'Vuelo de salida', 'piloto y copiloto', 'USA', 'pista - 01B', '2021-09-22', '21:00:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight_requeriment_airline`
--

CREATE TABLE `tb_flight_requeriment_airline` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(15) NOT NULL,
  `model_plane` varchar(50) NOT NULL,
  `Type_flight` varchar(50) NOT NULL,
  `flight_selection` varchar(50) NOT NULL,
  `capacity_plane` varchar(50) NOT NULL,
  `crew_plane` varchar(50) NOT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `id_airline` int(11) NOT NULL,
  `destination` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight_requeriment_airline`
--

INSERT INTO `tb_flight_requeriment_airline` (`id`, `code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `id_airline`, `destination`) VALUES
(1, 'A001', 'YX-578', 'Vuelo de pasajeros', 'Vuelo de llegada', '80', 'Piloto', '2022-06-25', '19:00:00', 1, 'Tokio'),
(7, 'A002', 'QWE-309', 'Vuelo de carga', 'Vuelo de salida', '350', 'piloto y copiloto', '2021-09-22', '21:00:00', 1, 'USA'),
(8, 'A003', 'TYJ-124', 'Vuelo de carga', 'Vuelo de salida', '950', 'piloto y copiloto', '2023-01-05', '02:40:00', 1, 'Bogota'),
(9, 'A004', 'WED-321', 'Vuelo de carga', 'Vuelo de salida', '500', 'piloto y copiloto', '2022-01-10', '16:00:00', 1, 'Berlin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_freight`
--

CREATE TABLE `tb_freight` (
  `id` int(11) NOT NULL,
  `code_freight` varchar(15) NOT NULL,
  `supported_weight` double NOT NULL,
  `id_plane` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_passengers`
--

CREATE TABLE `tb_passengers` (
  `id` int(11) NOT NULL,
  `code_passenger` varchar(15) NOT NULL,
  `supported_passengers` int(11) NOT NULL,
  `id_plane` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_pilots`
--

CREATE TABLE `tb_pilots` (
  `id` int(11) NOT NULL,
  `id_pilot` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `experience` varchar(200) NOT NULL,
  `medical_checkup` varchar(200) NOT NULL,
  `id_flight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_plane`
--

CREATE TABLE `tb_plane` (
  `id` int(11) NOT NULL,
  `code_plane` varchar(15) NOT NULL,
  `model` varchar(100) NOT NULL,
  `capacity` varchar(255) NOT NULL,
  `storage_type` varchar(60) NOT NULL,
  `id_airport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_airline`
--
ALTER TABLE `tb_airline`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airport` (`id_airport`);

--
-- Indexes for table `tb_airline_staff`
--
ALTER TABLE `tb_airline_staff`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_airport`
--
ALTER TABLE `tb_airport`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airport` (`id_airport`);

--
-- Indexes for table `tb_arrival`
--
ALTER TABLE `tb_arrival`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_flight` (`id_flight`);

--
-- Indexes for table `tb_departure`
--
ALTER TABLE `tb_departure`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_flight` (`id_flight`);

--
-- Indexes for table `tb_flight`
--
ALTER TABLE `tb_flight`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_flight_requeriment_airline`
--
ALTER TABLE `tb_flight_requeriment_airline`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_freight`
--
ALTER TABLE `tb_freight`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_plane` (`id_plane`);

--
-- Indexes for table `tb_passengers`
--
ALTER TABLE `tb_passengers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_plane` (`id_plane`);

--
-- Indexes for table `tb_pilots`
--
ALTER TABLE `tb_pilots`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_flight` (`id_flight`);

--
-- Indexes for table `tb_plane`
--
ALTER TABLE `tb_plane`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airport` (`id_airport`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_airline`
--
ALTER TABLE `tb_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_airline_staff`
--
ALTER TABLE `tb_airline_staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tb_airport`
--
ALTER TABLE `tb_airport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tb_arrival`
--
ALTER TABLE `tb_arrival`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_departure`
--
ALTER TABLE `tb_departure`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_flight`
--
ALTER TABLE `tb_flight`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `tb_flight_requeriment_airline`
--
ALTER TABLE `tb_flight_requeriment_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tb_freight`
--
ALTER TABLE `tb_freight`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_passengers`
--
ALTER TABLE `tb_passengers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_pilots`
--
ALTER TABLE `tb_pilots`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_plane`
--
ALTER TABLE `tb_plane`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_airline`
--
ALTER TABLE `tb_airline`
  ADD CONSTRAINT `tb_airline_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);

--
-- Constraints for table `tb_airline_staff`
--
ALTER TABLE `tb_airline_staff`
  ADD CONSTRAINT `tb_airline_staff_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  ADD CONSTRAINT `tb_airport_staff_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);

--
-- Constraints for table `tb_arrival`
--
ALTER TABLE `tb_arrival`
  ADD CONSTRAINT `tb_arrival_ibfk_1` FOREIGN KEY (`id_flight`) REFERENCES `tb_flight` (`id`);

--
-- Constraints for table `tb_departure`
--
ALTER TABLE `tb_departure`
  ADD CONSTRAINT `tb_departure_ibfk_1` FOREIGN KEY (`id_flight`) REFERENCES `tb_flight` (`id`);

--
-- Constraints for table `tb_flight`
--
ALTER TABLE `tb_flight`
  ADD CONSTRAINT `tb_flight_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_flight_requeriment_airline`
--
ALTER TABLE `tb_flight_requeriment_airline`
  ADD CONSTRAINT `tb_flight_requeriment_airline_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_freight`
--
ALTER TABLE `tb_freight`
  ADD CONSTRAINT `tb_freight_ibfk_1` FOREIGN KEY (`id_plane`) REFERENCES `tb_plane` (`id`);

--
-- Constraints for table `tb_passengers`
--
ALTER TABLE `tb_passengers`
  ADD CONSTRAINT `tb_passengers_ibfk_1` FOREIGN KEY (`id_plane`) REFERENCES `tb_plane` (`id`);

--
-- Constraints for table `tb_pilots`
--
ALTER TABLE `tb_pilots`
  ADD CONSTRAINT `tb_pilots_ibfk_1` FOREIGN KEY (`id_flight`) REFERENCES `tb_flight` (`id`);

--
-- Constraints for table `tb_plane`
--
ALTER TABLE `tb_plane`
  ADD CONSTRAINT `tb_plane_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
