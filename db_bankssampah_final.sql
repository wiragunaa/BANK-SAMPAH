/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.4.32-MariaDB : Database - db_pengguna_banksampah
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_pengguna_banksampah` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `db_pengguna_banksampah`;

/*Table structure for table `tb_jadwal` */

DROP TABLE IF EXISTS `tb_jadwal`;

CREATE TABLE `tb_jadwal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hari` varchar(255) DEFAULT NULL,
  `tanggal` varchar(255) DEFAULT NULL,
  `jenis_sampah` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `tb_jadwal` */

insert  into `tb_jadwal`(`id`,`hari`,`tanggal`,`jenis_sampah`) values 
(1,'Minggu','30 Juni 2024','Organik');

/*Table structure for table `tb_pengguna` */

DROP TABLE IF EXISTS `tb_pengguna`;

CREATE TABLE `tb_pengguna` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_lengkap` varchar(255) NOT NULL,
  `username_pengguna` varchar(255) NOT NULL,
  `password_pengguna` varchar(255) NOT NULL,
  `alamat_pengguna` varchar(255) DEFAULT NULL,
  `kabupaten` varchar(255) DEFAULT NULL,
  `kecamatan` varchar(255) DEFAULT NULL,
  `kelurahan` varchar(255) DEFAULT NULL,
  `nomor_telepon` varchar(255) DEFAULT NULL,
  `poin_pengguna` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `tb_pengguna` */

insert  into `tb_pengguna`(`id`,`nama_lengkap`,`username_pengguna`,`password_pengguna`,`alamat_pengguna`,`kabupaten`,`kecamatan`,`kelurahan`,`nomor_telepon`,`poin_pengguna`) values 
(1,'Pengguna Admin','Admin','123',NULL,NULL,NULL,NULL,NULL,0),
(2,'Pengguna Operator','Operator','123',NULL,NULL,NULL,NULL,NULL,0);

/*Table structure for table `tb_penukaran_barang` */

DROP TABLE IF EXISTS `tb_penukaran_barang`;

CREATE TABLE `tb_penukaran_barang` (
  `id_unik` char(5) NOT NULL,
  `username_pengguna` varchar(255) NOT NULL,
  `poin_ditukarkan` int(11) NOT NULL,
  `list_barang` text DEFAULT NULL,
  `status_pengambilan` enum('Sudah','Belum') DEFAULT NULL,
  `waktu_penukaran` date NOT NULL DEFAULT curdate(),
  PRIMARY KEY (`id_unik`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `tb_penukaran_barang` */

/*Table structure for table `tb_penukaran_sampah` */

DROP TABLE IF EXISTS `tb_penukaran_sampah`;

CREATE TABLE `tb_penukaran_sampah` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username_pengguna` varchar(255) NOT NULL,
  `poin_tambahan` int(11) NOT NULL,
  `berat_total` int(11) NOT NULL,
  `status_penukaran` enum('Sudah','Belum') NOT NULL DEFAULT 'Belum',
  `catatan` text DEFAULT NULL,
  `waktu_input` date NOT NULL DEFAULT curdate(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `tb_penukaran_sampah` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
