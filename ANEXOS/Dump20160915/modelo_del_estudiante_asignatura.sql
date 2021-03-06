CREATE DATABASE  IF NOT EXISTS `modelo_del_estudiante` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `modelo_del_estudiante`;
-- MySQL dump 10.13  Distrib 5.5.47, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: modelo_del_estudiante
-- ------------------------------------------------------
-- Server version	5.5.47-0ubuntu0.14.04.1

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
-- Table structure for table `asignatura`
--

DROP TABLE IF EXISTS `asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asignatura` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `arbolDominio` blob,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignatura`
--

LOCK TABLES `asignatura` WRITE;
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
INSERT INTO `asignatura` VALUES ('6A6','Programación III','��\0sr\0modelo.Arbol_PerturbacionY,�ο�	�\0L\0descripciont\0Ljava/lang/String;L\0nombreq\0~\0L\0raizt\0\ZLmodelo/Nodo_Perturbacion;L\0	treeModelt\0#Ljavax/swing/tree/DefaultTreeModel;xpt\0< sin descripción >t\0arbol de dominiosr\0modelo.Nodo_Perturbacion��R����\0\0xr\0\'javax.swing.tree.DefaultMutableTreeNode�X���q�\0Z\0allowsChildrenL\0childrent\0Ljava/util/Vector;L\0parentt\0\"Ljavax/swing/tree/MutableTreeNode;xpsr\0java.util.Vectorٗ}[�;�\0I\0capacityIncrementI\0elementCount[\0elementDatat\0[Ljava/lang/Object;xp\0\0\0\0\0\0\0ur\0[Ljava.lang.Object;��X�s)l\0\0xp\0\0\0\nsq\0~\0sq\0~\0\0\0\0\0\0\0\0uq\0~\0\0\0\0\nsq\0~\0pq\0~\0uq\0~\0\0\0\0t\0\nuserObjectsr\0modelo.DatoBean�yQ���_\0L\0etiquetaBeant\0Lmodelo/EtiquetaBean;L\0idDatoq\0~\0L\0propertySupportt\0\"Ljava/beans/PropertyChangeSupport;xpsr\0modelo.EtiquetaBean���,bػ�\0D\0	aprendidoD\0conocidoD\0desconocidoD\0parcialmente_conocidoxp\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0t\0nietopxsq\0~\0sq\0~\0\0\0\0\0\0\0\0uq\0~\0\0\0\0\nsq\0~\0pq\0~\0uq\0~\0\0\0\0q\0~\0sq\0~\0sq\0~\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0t\0otropxpppppppppxq\0~\0uq\0~\0\0\0\0q\0~\0sq\0~\0sq\0~\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0t\0nieto2pxppppppppxq\0~\0uq\0~\0\0\0\0q\0~\0sq\0~\0sq\0~\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0t\0hijopxpppppppppxpuq\0~\0\0\0\0q\0~\0sq\0~\0sq\0~\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0t\0raizpxsr\0!javax.swing.tree.DefaultTreeModel���&\Z���\0Z\0asksAllowsChildrenL\0listenerListt\0%Ljavax/swing/event/EventListenerList;L\0roott\0Ljavax/swing/tree/TreeNode;xp\0sr\0#javax.swing.event.EventListenerList�6�}���D\0\0xppxq\0~\0sq\0~\0\0\0\0\0\0\0\0uq\0~\0\0\0\0\nt\0rootq\0~\0ppppppppxx'),('6A7','Matematica',NULL);
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-15  9:44:23
