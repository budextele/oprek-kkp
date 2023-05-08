-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Bulan Mei 2023 pada 11.00
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_manager`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `ID` bigint(20) NOT NULL,
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL,
  `level` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`ID`, `Username`, `Password`, `level`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'tek', 'tek', 'teknisi'),
(3, 'ceo', 'ceo', 'ceo');

-- --------------------------------------------------------

--
-- Struktur dari tabel `maintenance`
--

CREATE TABLE `maintenance` (
  `No_Ticket` varchar(25) NOT NULL,
  `Nama_Project` varchar(25) NOT NULL,
  `Tanggal` date NOT NULL,
  `Problem` text NOT NULL,
  `PIC` varchar(25) NOT NULL,
  `Action` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `master_project`
--

CREATE TABLE `master_project` (
  `ID` varchar(25) NOT NULL,
  `Nama_Project` varchar(25) NOT NULL,
  `Lokasi` varchar(25) NOT NULL,
  `PIC` varchar(25) NOT NULL,
  `Status` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pic_sre`
--

CREATE TABLE `pic_sre` (
  `Id` int(5) NOT NULL,
  `Nama_PIC_SRE` varchar(25) NOT NULL,
  `No_Handphone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `qa`
--

CREATE TABLE `qa` (
  `No` bigint(5) NOT NULL,
  `Nama_Project` varchar(25) NOT NULL,
  `PIC_QA` varchar(25) NOT NULL,
  `Tanggal` date NOT NULL,
  `Item_Tes` varchar(50) NOT NULL,
  `Status` varchar(15) NOT NULL,
  `Keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `report_project`
--

CREATE TABLE `report_project` (
  `No` bigint(20) NOT NULL,
  `ID` varchar(25) NOT NULL,
  `Nama_Project` varchar(25) NOT NULL,
  `Tanggal` date NOT NULL,
  `Pekerjaan` text NOT NULL,
  `PIC` varchar(25) NOT NULL,
  `Lampiran` longblob NOT NULL,
  `File_Name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `timeline_project`
--

CREATE TABLE `timeline_project` (
  `ID` varchar(25) NOT NULL,
  `Nama_Project` varchar(25) NOT NULL,
  `Tanggal_Mulai` date NOT NULL,
  `Tanggal_Selesai` date NOT NULL,
  `Pekerjaan` text NOT NULL,
  `No` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indeks untuk tabel `maintenance`
--
ALTER TABLE `maintenance`
  ADD PRIMARY KEY (`No_Ticket`);

--
-- Indeks untuk tabel `master_project`
--
ALTER TABLE `master_project`
  ADD PRIMARY KEY (`ID`);

--
-- Indeks untuk tabel `pic_sre`
--
ALTER TABLE `pic_sre`
  ADD PRIMARY KEY (`Id`);

--
-- Indeks untuk tabel `qa`
--
ALTER TABLE `qa`
  ADD PRIMARY KEY (`No`);

--
-- Indeks untuk tabel `report_project`
--
ALTER TABLE `report_project`
  ADD PRIMARY KEY (`No`);

--
-- Indeks untuk tabel `timeline_project`
--
ALTER TABLE `timeline_project`
  ADD PRIMARY KEY (`No`),
  ADD KEY `ID` (`ID`) USING BTREE;

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `login`
--
ALTER TABLE `login`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `pic_sre`
--
ALTER TABLE `pic_sre`
  MODIFY `Id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `qa`
--
ALTER TABLE `qa`
  MODIFY `No` bigint(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `report_project`
--
ALTER TABLE `report_project`
  MODIFY `No` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `timeline_project`
--
ALTER TABLE `timeline_project`
  MODIFY `No` bigint(20) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
