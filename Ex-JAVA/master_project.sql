-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Jul 2022 pada 15.14
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
-- Database: `oprek_kkp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `master_project`
--

CREATE TABLE `master_project` (
  `id` bigint(20) NOT NULL,
  `nama proyek` varchar(15) DEFAULT NULL,
  `lokasi` varchar(25) DEFAULT NULL,
  `pic` varchar(25) DEFAULT NULL,
  `keterangan` text DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `master_project`
--

INSERT INTO `master_project` (`id`, `nama proyek`, `lokasi`, `pic`, `keterangan`, `timestamp`) VALUES
(1, 'medco 8', 'scbd jaksel', 'joko', 'kajshaskfh alkjfsl alksjfaslh f alkejfahlf lkajshfl ', '2022-07-22 09:23:58'),
(3, 'de de', 'ef e', ' ef ', ' f f f ', '2022-07-22 09:40:34'),
(4, 'de devvv', 'ef evvv', ' ef ', ' f f f ', '2022-07-22 09:40:40'),
(5, 'scsc', 'scs', 'scs', 'scscscav agaw gqga', '2022-07-22 12:52:56'),
(6, 'wVWC', ' wefW', 'dwvW ', 'A WRGQWR GQ Q4 GQ4GQ', '2022-07-22 12:54:14'),
(7, 'sc', 'CCCCCC', 'C', 'SCAS', '2022-07-22 13:00:52'),
(8, 'dvas', 'asdvasd', 'asdvasv', 'advadsv ', '2022-07-22 13:04:13'),
(9, 'eeve', 'vsv', 'vdvd', 'abefbeb sesergs', '2022-07-22 13:07:13');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `master_project`
--
ALTER TABLE `master_project`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `master_project`
--
ALTER TABLE `master_project`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
