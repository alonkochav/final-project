-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 20, 2017 at 10:08 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qualit-e`
--

-- --------------------------------------------------------

--
-- Table structure for table `activations`
--

CREATE TABLE `activations` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `completed` tinyint(1) NOT NULL DEFAULT '0',
  `completed_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `article` text NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `url` varchar(255) NOT NULL,
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `title`, `article`, `image`, `url`, `updated_at`, `created_at`) VALUES
(1, 'Eco-friendly Products', 'Eco-friendly inventions are revolutionizing the way we generate energy, recycle waste and protect the planet', 'eco-friendly.png', 'eco-friendly', '2016-12-11 20:22:42', '2016-12-11 20:22:42'),
(2, 'Household Products', 'These new gadgets and products will make your home smarter, more functional, and more fun to live in', 'household.png', 'household', '2016-12-11 20:22:42', '2016-12-11 20:22:42'),
(3, 'Kitchen Appliances', 'Cooking is easier and faster with the right equipment. Stock your kitchen with these basics', 'kitchen.png', 'kitchen', '2016-12-11 20:22:42', '2016-12-11 20:22:42'),
(4, 'Office Equipment and Supplies', 'Discover which office equipment and supplies you need to maintain a productive workplace', 'office.png', 'office', '2016-12-11 20:22:42', '2016-12-11 20:22:42'),
(5, 'Outdoors and Sports Gear', 'Spend more time outdoors, and enjoy it with high-performance outdoors gear', 'outdoors.png', 'outdoors', '2016-12-11 20:22:42', '2016-12-11 20:22:42');

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE `contacts` (
  `id` int(11) NOT NULL,
  `user_ip` varchar(15) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `message` text NOT NULL,
  `read` tinyint(1) NOT NULL DEFAULT '0',
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`id`, `user_ip`, `user_id`, `name`, `email`, `message`, `read`, `updated_at`, `created_at`) VALUES
(2, '0', NULL, 'Alon Kochav', 'alonkochav@gmail.com', 'Yh', 1, '2017-02-20 13:00:33', '2017-01-31 16:27:30'),
(5, '1337374099', 7, 'Alon Kochav', 'alonkochav@gmail.com', 'Hi i made an order on Wednesday but I never received a confirmation. Can you please send me a confirmation by email ?\r\n\r\nTHanks\r\nalonkochav@gmail.com', 1, '2017-02-20 13:00:35', '2017-02-18 22:08:17');

-- --------------------------------------------------------

--
-- Table structure for table `contents`
--

CREATE TABLE `contents` (
  `id` int(11) NOT NULL,
  `menu_id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `article` text NOT NULL,
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contents`
--

INSERT INTO `contents` (`id`, `menu_id`, `title`, `article`, `updated_at`, `created_at`) VALUES
(1, 1, 'About Us', '<div class=''row''>\r\n<div class=''col-md-4''>\r\n\r\n<h3 style="text-align: center;"><b>WHAT DO WE DO?</b></h3>\r\n\r\n<p style="text-align: left;">\r\nQualit-e gives you a chance to quickly and easily find the high quality product you want and have it delivered to your home in no time, regardless of your location.</font></p><p style="text-align: left;"></p>\r\n\r\n</div>\r\n<div class=''col-md-8''>\r\n\r\n<h3 style="text-align: center;"><b>WHY DO CUSTOMERS LOVE US?</b></h3>\r\n\r\n<p style="text-align: left;">We have been in the business for quite a while now, and it that time we have not only managed to make close relationships with numerous suppliers all over the world, but also to recognize what people need. This means that we are always able to offer all the latest devices, great prices, reliable service, fast delivery and premium customer support.</p>\r\n\r\n</div>\r\n</div>\r\n<div class=''row''>\r\n\r\n<div class=''col-md-4''>\r\n\r\n<h3 style="text-align: center;"><b>\r\nBEGINNING</b></h3>\r\n\r\n<p style="text-align: left;">\r\nQualit-e  website was launched in 2017, but its story actually began some 8 years before that when a group of college friends decided to go into business together. We started selling gadgets in shops, but our combined ambition, drive and abilities soon made us look for new challenges and new markets. Starting an online shop provided for both and allowed us to develop a strong international presence.</font></p>\r\n\r\n</div>\r\n<div class=''col-md-8''>\r\n\r\n<h3 style="text-align: center;"><b>TODAY</b></h3>\r\n\r\n<p style="text-align: left;">\r\nCollective experience of our team members and the years we have spent in the business allowed us to develop a vast network of suppliers, ensuring that our customers will always find what they are looking for. This also means that we are able to offer great prices, which are constantly being updated and follow the shifts in the market.\r\nOur affordability, fast and reliable delivery, and the fact that you will always be able to find the product that you are looking for in our offer, have made us stand out in the market, but they are simply symptoms of our dedication to what we are doing and our desire to constantly keep improving. We know that in order to do that, we need to keep in close touch with our customers and listen to their suggestions and critiques. This is why our customer service, which is always there to answer any question that you may have, is just as willing to listen as it is to inform.</p>\r\n</div>\r\n</div>', '2017-02-09 15:00:29', '2017-01-10 09:20:17'),
(2, 3, 'Shop', '', '2017-02-09 15:02:05', '2017-01-11 13:14:36'),
(3, 2, 'Contact Us', '', '2017-02-09 15:02:15', '2017-01-11 14:06:16');

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `id` int(11) NOT NULL,
  `iso` char(2) CHARACTER SET latin1 NOT NULL,
  `name` varchar(80) CHARACTER SET latin1 NOT NULL,
  `nicename` varchar(80) CHARACTER SET latin1 NOT NULL,
  `iso3` char(3) CHARACTER SET latin1 DEFAULT NULL,
  `numcode` smallint(6) DEFAULT NULL,
  `phonecode` int(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`id`, `iso`, `name`, `nicename`, `iso3`, `numcode`, `phonecode`) VALUES
(1, 'AF', 'AFGHANISTAN', 'Afghanistan', 'AFG', 4, 93),
(2, 'AL', 'ALBANIA', 'Albania', 'ALB', 8, 355),
(3, 'DZ', 'ALGERIA', 'Algeria', 'DZA', 12, 213),
(4, 'AS', 'AMERICAN SAMOA', 'American Samoa', 'ASM', 16, 1684),
(5, 'AD', 'ANDORRA', 'Andorra', 'AND', 20, 376),
(6, 'AO', 'ANGOLA', 'Angola', 'AGO', 24, 244),
(7, 'AI', 'ANGUILLA', 'Anguilla', 'AIA', 660, 1264),
(8, 'AQ', 'ANTARCTICA', 'Antarctica', NULL, NULL, 0),
(9, 'AG', 'ANTIGUA AND BARBUDA', 'Antigua and Barbuda', 'ATG', 28, 1268),
(10, 'AR', 'ARGENTINA', 'Argentina', 'ARG', 32, 54),
(11, 'AM', 'ARMENIA', 'Armenia', 'ARM', 51, 374),
(12, 'AW', 'ARUBA', 'Aruba', 'ABW', 533, 297),
(13, 'AU', 'AUSTRALIA', 'Australia', 'AUS', 36, 61),
(14, 'AT', 'AUSTRIA', 'Austria', 'AUT', 40, 43),
(15, 'AZ', 'AZERBAIJAN', 'Azerbaijan', 'AZE', 31, 994),
(16, 'BS', 'BAHAMAS', 'Bahamas', 'BHS', 44, 1242),
(17, 'BH', 'BAHRAIN', 'Bahrain', 'BHR', 48, 973),
(18, 'BD', 'BANGLADESH', 'Bangladesh', 'BGD', 50, 880),
(19, 'BB', 'BARBADOS', 'Barbados', 'BRB', 52, 1246),
(20, 'BY', 'BELARUS', 'Belarus', 'BLR', 112, 375),
(21, 'BE', 'BELGIUM', 'Belgium', 'BEL', 56, 32),
(22, 'BZ', 'BELIZE', 'Belize', 'BLZ', 84, 501),
(23, 'BJ', 'BENIN', 'Benin', 'BEN', 204, 229),
(24, 'BM', 'BERMUDA', 'Bermuda', 'BMU', 60, 1441),
(25, 'BT', 'BHUTAN', 'Bhutan', 'BTN', 64, 975),
(26, 'BO', 'BOLIVIA', 'Bolivia', 'BOL', 68, 591),
(27, 'BA', 'BOSNIA AND HERZEGOVINA', 'Bosnia and Herzegovina', 'BIH', 70, 387),
(28, 'BW', 'BOTSWANA', 'Botswana', 'BWA', 72, 267),
(30, 'BR', 'BRAZIL', 'Brazil', 'BRA', 76, 55),
(32, 'BN', 'BRUNEI DARUSSALAM', 'Brunei Darussalam', 'BRN', 96, 673),
(33, 'BG', 'BULGARIA', 'Bulgaria', 'BGR', 100, 359),
(34, 'BF', 'BURKINA FASO', 'Burkina Faso', 'BFA', 854, 226),
(35, 'BI', 'BURUNDI', 'Burundi', 'BDI', 108, 257),
(36, 'KH', 'CAMBODIA', 'Cambodia', 'KHM', 116, 855),
(37, 'CM', 'CAMEROON', 'Cameroon', 'CMR', 120, 237),
(38, 'CA', 'CANADA', 'Canada', 'CAN', 124, 1),
(39, 'CV', 'CAPE VERDE', 'Cape Verde', 'CPV', 132, 238),
(40, 'KY', 'CAYMAN ISLANDS', 'Cayman Islands', 'CYM', 136, 1345),
(41, 'CF', 'CENTRAL AFRICAN REPUBLIC', 'Central African Republic', 'CAF', 140, 236),
(42, 'TD', 'CHAD', 'Chad', 'TCD', 148, 235),
(43, 'CL', 'CHILE', 'Chile', 'CHL', 152, 56),
(44, 'CN', 'CHINA', 'China', 'CHN', 156, 86),
(47, 'CO', 'COLOMBIA', 'Colombia', 'COL', 170, 57),
(48, 'KM', 'COMOROS', 'Comoros', 'COM', 174, 269),
(49, 'CG', 'CONGO', 'Congo', 'COG', 178, 242),
(50, 'CD', 'CONGO, THE DEMOCRATIC REPUBLIC OF THE', 'Congo, the Democratic Republic of the', 'COD', 180, 242),
(51, 'CK', 'COOK ISLANDS', 'Cook Islands', 'COK', 184, 682),
(52, 'CR', 'COSTA RICA', 'Costa Rica', 'CRI', 188, 506),
(53, 'CI', 'COTE D''IVOIRE', 'Cote D''Ivoire', 'CIV', 384, 225),
(54, 'HR', 'CROATIA', 'Croatia', 'HRV', 191, 385),
(55, 'CU', 'CUBA', 'Cuba', 'CUB', 192, 53),
(56, 'CY', 'CYPRUS', 'Cyprus', 'CYP', 196, 357),
(57, 'CZ', 'CZECH REPUBLIC', 'Czech Republic', 'CZE', 203, 420),
(58, 'DK', 'DENMARK', 'Denmark', 'DNK', 208, 45),
(59, 'DJ', 'DJIBOUTI', 'Djibouti', 'DJI', 262, 253),
(60, 'DM', 'DOMINICA', 'Dominica', 'DMA', 212, 1767),
(61, 'DO', 'DOMINICAN REPUBLIC', 'Dominican Republic', 'DOM', 214, 1809),
(62, 'EC', 'ECUADOR', 'Ecuador', 'ECU', 218, 593),
(63, 'EG', 'EGYPT', 'Egypt', 'EGY', 818, 20),
(64, 'SV', 'EL SALVADOR', 'El Salvador', 'SLV', 222, 503),
(65, 'GQ', 'EQUATORIAL GUINEA', 'Equatorial Guinea', 'GNQ', 226, 240),
(66, 'ER', 'ERITREA', 'Eritrea', 'ERI', 232, 291),
(67, 'EE', 'ESTONIA', 'Estonia', 'EST', 233, 372),
(68, 'ET', 'ETHIOPIA', 'Ethiopia', 'ETH', 231, 251),
(69, 'FK', 'FALKLAND ISLANDS (MALVINAS)', 'Falkland Islands (Malvinas)', 'FLK', 238, 500),
(70, 'FO', 'FAROE ISLANDS', 'Faroe Islands', 'FRO', 234, 298),
(71, 'FJ', 'FIJI', 'Fiji', 'FJI', 242, 679),
(72, 'FI', 'FINLAND', 'Finland', 'FIN', 246, 358),
(73, 'FR', 'FRANCE', 'France', 'FRA', 250, 33),
(74, 'GF', 'FRENCH GUIANA', 'French Guiana', 'GUF', 254, 594),
(75, 'PF', 'FRENCH POLYNESIA', 'French Polynesia', 'PYF', 258, 689),
(77, 'GA', 'GABON', 'Gabon', 'GAB', 266, 241),
(78, 'GM', 'GAMBIA', 'Gambia', 'GMB', 270, 220),
(79, 'GE', 'GEORGIA', 'Georgia', 'GEO', 268, 995),
(80, 'DE', 'GERMANY', 'Germany', 'DEU', 276, 49),
(81, 'GH', 'GHANA', 'Ghana', 'GHA', 288, 233),
(82, 'GI', 'GIBRALTAR', 'Gibraltar', 'GIB', 292, 350),
(83, 'GR', 'GREECE', 'Greece', 'GRC', 300, 30),
(84, 'GL', 'GREENLAND', 'Greenland', 'GRL', 304, 299),
(85, 'GD', 'GRENADA', 'Grenada', 'GRD', 308, 1473),
(86, 'GP', 'GUADELOUPE', 'Guadeloupe', 'GLP', 312, 590),
(87, 'GU', 'GUAM', 'Guam', 'GUM', 316, 1671),
(88, 'GT', 'GUATEMALA', 'Guatemala', 'GTM', 320, 502),
(89, 'GN', 'GUINEA', 'Guinea', 'GIN', 324, 224),
(90, 'GW', 'GUINEA-BISSAU', 'Guinea-Bissau', 'GNB', 624, 245),
(91, 'GY', 'GUYANA', 'Guyana', 'GUY', 328, 592),
(92, 'HT', 'HAITI', 'Haiti', 'HTI', 332, 509),
(94, 'VA', 'HOLY SEE (VATICAN CITY STATE)', 'Holy See (Vatican City State)', 'VAT', 336, 39),
(95, 'HN', 'HONDURAS', 'Honduras', 'HND', 340, 504),
(96, 'HK', 'HONG KONG', 'Hong Kong', 'HKG', 344, 852),
(97, 'HU', 'HUNGARY', 'Hungary', 'HUN', 348, 36),
(98, 'IS', 'ICELAND', 'Iceland', 'ISL', 352, 354),
(99, 'IN', 'INDIA', 'India', 'IND', 356, 91),
(100, 'ID', 'INDONESIA', 'Indonesia', 'IDN', 360, 62),
(101, 'IR', 'IRAN, ISLAMIC REPUBLIC OF', 'Iran, Islamic Republic of', 'IRN', 364, 98),
(102, 'IQ', 'IRAQ', 'Iraq', 'IRQ', 368, 964),
(103, 'IE', 'IRELAND', 'Ireland', 'IRL', 372, 353),
(104, 'IL', 'ISRAEL', 'Israel', 'ISR', 376, 972),
(105, 'IT', 'ITALY', 'Italy', 'ITA', 380, 39),
(106, 'JM', 'JAMAICA', 'Jamaica', 'JAM', 388, 1876),
(107, 'JP', 'JAPAN', 'Japan', 'JPN', 392, 81),
(108, 'JO', 'JORDAN', 'Jordan', 'JOR', 400, 962),
(109, 'KZ', 'KAZAKHSTAN', 'Kazakhstan', 'KAZ', 398, 7),
(110, 'KE', 'KENYA', 'Kenya', 'KEN', 404, 254),
(111, 'KI', 'KIRIBATI', 'Kiribati', 'KIR', 296, 686),
(112, 'KP', 'KOREA, DEMOCRATIC PEOPLE''S REPUBLIC OF', 'Korea, Democratic People''s Republic of', 'PRK', 408, 850),
(113, 'KR', 'KOREA, REPUBLIC OF', 'Korea, Republic of', 'KOR', 410, 82),
(114, 'KW', 'KUWAIT', 'Kuwait', 'KWT', 414, 965),
(115, 'KG', 'KYRGYZSTAN', 'Kyrgyzstan', 'KGZ', 417, 996),
(116, 'LA', 'LAO PEOPLE''S DEMOCRATIC REPUBLIC', 'Lao People''s Democratic Republic', 'LAO', 418, 856),
(117, 'LV', 'LATVIA', 'Latvia', 'LVA', 428, 371),
(118, 'LB', 'LEBANON', 'Lebanon', 'LBN', 422, 961),
(119, 'LS', 'LESOTHO', 'Lesotho', 'LSO', 426, 266),
(120, 'LR', 'LIBERIA', 'Liberia', 'LBR', 430, 231),
(121, 'LY', 'LIBYAN ARAB JAMAHIRIYA', 'Libyan Arab Jamahiriya', 'LBY', 434, 218),
(122, 'LI', 'LIECHTENSTEIN', 'Liechtenstein', 'LIE', 438, 423),
(123, 'LT', 'LITHUANIA', 'Lithuania', 'LTU', 440, 370),
(124, 'LU', 'LUXEMBOURG', 'Luxembourg', 'LUX', 442, 352),
(125, 'MO', 'MACAO', 'Macao', 'MAC', 446, 853),
(126, 'MK', 'MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF', 'Macedonia, the Former Yugoslav Republic of', 'MKD', 807, 389),
(127, 'MG', 'MADAGASCAR', 'Madagascar', 'MDG', 450, 261),
(128, 'MW', 'MALAWI', 'Malawi', 'MWI', 454, 265),
(129, 'MY', 'MALAYSIA', 'Malaysia', 'MYS', 458, 60),
(130, 'MV', 'MALDIVES', 'Maldives', 'MDV', 462, 960),
(131, 'ML', 'MALI', 'Mali', 'MLI', 466, 223),
(132, 'MT', 'MALTA', 'Malta', 'MLT', 470, 356),
(133, 'MH', 'MARSHALL ISLANDS', 'Marshall Islands', 'MHL', 584, 692),
(134, 'MQ', 'MARTINIQUE', 'Martinique', 'MTQ', 474, 596),
(135, 'MR', 'MAURITANIA', 'Mauritania', 'MRT', 478, 222),
(136, 'MU', 'MAURITIUS', 'Mauritius', 'MUS', 480, 230),
(138, 'MX', 'MEXICO', 'Mexico', 'MEX', 484, 52),
(139, 'FM', 'MICRONESIA, FEDERATED STATES OF', 'Micronesia, Federated States of', 'FSM', 583, 691),
(140, 'MD', 'MOLDOVA, REPUBLIC OF', 'Moldova, Republic of', 'MDA', 498, 373),
(141, 'MC', 'MONACO', 'Monaco', 'MCO', 492, 377),
(142, 'MN', 'MONGOLIA', 'Mongolia', 'MNG', 496, 976),
(143, 'MS', 'MONTSERRAT', 'Montserrat', 'MSR', 500, 1664),
(144, 'MA', 'MOROCCO', 'Morocco', 'MAR', 504, 212),
(145, 'MZ', 'MOZAMBIQUE', 'Mozambique', 'MOZ', 508, 258),
(146, 'MM', 'MYANMAR', 'Myanmar', 'MMR', 104, 95),
(147, 'NA', 'NAMIBIA', 'Namibia', 'NAM', 516, 264),
(148, 'NR', 'NAURU', 'Nauru', 'NRU', 520, 674),
(149, 'NP', 'NEPAL', 'Nepal', 'NPL', 524, 977),
(150, 'NL', 'NETHERLANDS', 'Netherlands', 'NLD', 528, 31),
(151, 'AN', 'NETHERLANDS ANTILLES', 'Netherlands Antilles', 'ANT', 530, 599),
(152, 'NC', 'NEW CALEDONIA', 'New Caledonia', 'NCL', 540, 687),
(153, 'NZ', 'NEW ZEALAND', 'New Zealand', 'NZL', 554, 64),
(154, 'NI', 'NICARAGUA', 'Nicaragua', 'NIC', 558, 505),
(155, 'NE', 'NIGER', 'Niger', 'NER', 562, 227),
(156, 'NG', 'NIGERIA', 'Nigeria', 'NGA', 566, 234),
(157, 'NU', 'NIUE', 'Niue', 'NIU', 570, 683),
(158, 'NF', 'NORFOLK ISLAND', 'Norfolk Island', 'NFK', 574, 672),
(159, 'MP', 'NORTHERN MARIANA ISLANDS', 'Northern Mariana Islands', 'MNP', 580, 1670),
(160, 'NO', 'NORWAY', 'Norway', 'NOR', 578, 47),
(161, 'OM', 'OMAN', 'Oman', 'OMN', 512, 968),
(162, 'PK', 'PAKISTAN', 'Pakistan', 'PAK', 586, 92),
(163, 'PW', 'PALAU', 'Palau', 'PLW', 585, 680),
(164, 'PS', 'PALESTINIAN TERRITORY, OCCUPIED', 'Palestinian Territory, Occupied', NULL, NULL, 970),
(165, 'PA', 'PANAMA', 'Panama', 'PAN', 591, 507),
(166, 'PG', 'PAPUA NEW GUINEA', 'Papua New Guinea', 'PNG', 598, 675),
(167, 'PY', 'PARAGUAY', 'Paraguay', 'PRY', 600, 595),
(168, 'PE', 'PERU', 'Peru', 'PER', 604, 51),
(169, 'PH', 'PHILIPPINES', 'Philippines', 'PHL', 608, 63),
(171, 'PL', 'POLAND', 'Poland', 'POL', 616, 48),
(172, 'PT', 'PORTUGAL', 'Portugal', 'PRT', 620, 351),
(173, 'PR', 'PUERTO RICO', 'Puerto Rico', 'PRI', 630, 1787),
(174, 'QA', 'QATAR', 'Qatar', 'QAT', 634, 974),
(175, 'RE', 'REUNION', 'Reunion', 'REU', 638, 262),
(176, 'RO', 'ROMANIA', 'Romania', 'ROM', 642, 40),
(177, 'RU', 'RUSSIAN FEDERATION', 'Russian Federation', 'RUS', 643, 70),
(178, 'RW', 'RWANDA', 'Rwanda', 'RWA', 646, 250),
(179, 'SH', 'SAINT HELENA', 'Saint Helena', 'SHN', 654, 290),
(180, 'KN', 'SAINT KITTS AND NEVIS', 'Saint Kitts and Nevis', 'KNA', 659, 1869),
(181, 'LC', 'SAINT LUCIA', 'Saint Lucia', 'LCA', 662, 1758),
(183, 'VC', 'SAINT VINCENT AND THE GRENADINES', 'Saint Vincent and the Grenadines', 'VCT', 670, 1784),
(184, 'WS', 'SAMOA', 'Samoa', 'WSM', 882, 684),
(185, 'SM', 'SAN MARINO', 'San Marino', 'SMR', 674, 378),
(186, 'ST', 'SAO TOME AND PRINCIPE', 'Sao Tome and Principe', 'STP', 678, 239),
(187, 'SA', 'SAUDI ARABIA', 'Saudi Arabia', 'SAU', 682, 966),
(188, 'SN', 'SENEGAL', 'Senegal', 'SEN', 686, 221),
(190, 'SC', 'SEYCHELLES', 'Seychelles', 'SYC', 690, 248),
(191, 'SL', 'SIERRA LEONE', 'Sierra Leone', 'SLE', 694, 232),
(192, 'SG', 'SINGAPORE', 'Singapore', 'SGP', 702, 65),
(193, 'SK', 'SLOVAKIA', 'Slovakia', 'SVK', 703, 421),
(194, 'SI', 'SLOVENIA', 'Slovenia', 'SVN', 705, 386),
(195, 'SB', 'SOLOMON ISLANDS', 'Solomon Islands', 'SLB', 90, 677),
(196, 'SO', 'SOMALIA', 'Somalia', 'SOM', 706, 252),
(197, 'ZA', 'SOUTH AFRICA', 'South Africa', 'ZAF', 710, 27),
(199, 'ES', 'SPAIN', 'Spain', 'ESP', 724, 34),
(200, 'LK', 'SRI LANKA', 'Sri Lanka', 'LKA', 144, 94),
(201, 'SD', 'SUDAN', 'Sudan', 'SDN', 736, 249),
(202, 'SR', 'SURINAME', 'Suriname', 'SUR', 740, 597),
(204, 'SZ', 'SWAZILAND', 'Swaziland', 'SWZ', 748, 268),
(205, 'SE', 'SWEDEN', 'Sweden', 'SWE', 752, 46),
(206, 'CH', 'SWITZERLAND', 'Switzerland', 'CHE', 756, 41),
(207, 'SY', 'SYRIAN ARAB REPUBLIC', 'Syrian Arab Republic', 'SYR', 760, 963),
(208, 'TW', 'TAIWAN, PROVINCE OF CHINA', 'Taiwan, Province of China', 'TWN', 158, 886),
(209, 'TJ', 'TAJIKISTAN', 'Tajikistan', 'TJK', 762, 992),
(210, 'TZ', 'TANZANIA, UNITED REPUBLIC OF', 'Tanzania, United Republic of', 'TZA', 834, 255),
(211, 'TH', 'THAILAND', 'Thailand', 'THA', 764, 66),
(212, 'TL', 'TIMOR-LESTE', 'Timor-Leste', NULL, NULL, 670),
(213, 'TG', 'TOGO', 'Togo', 'TGO', 768, 228),
(214, 'TK', 'TOKELAU', 'Tokelau', 'TKL', 772, 690),
(215, 'TO', 'TONGA', 'Tonga', 'TON', 776, 676),
(216, 'TT', 'TRINIDAD AND TOBAGO', 'Trinidad and Tobago', 'TTO', 780, 1868),
(217, 'TN', 'TUNISIA', 'Tunisia', 'TUN', 788, 216),
(218, 'TR', 'TURKEY', 'Turkey', 'TUR', 792, 90),
(219, 'TM', 'TURKMENISTAN', 'Turkmenistan', 'TKM', 795, 7370),
(220, 'TC', 'TURKS AND CAICOS ISLANDS', 'Turks and Caicos Islands', 'TCA', 796, 1649),
(221, 'TV', 'TUVALU', 'Tuvalu', 'TUV', 798, 688),
(222, 'UG', 'UGANDA', 'Uganda', 'UGA', 800, 256),
(223, 'UA', 'UKRAINE', 'Ukraine', 'UKR', 804, 380),
(224, 'AE', 'UNITED ARAB EMIRATES', 'United Arab Emirates', 'ARE', 784, 971),
(225, 'GB', 'UNITED KINGDOM', 'United Kingdom', 'GBR', 826, 44),
(226, 'US', 'UNITED STATES', 'United States', 'USA', 840, 1),
(228, 'UY', 'URUGUAY', 'Uruguay', 'URY', 858, 598),
(229, 'UZ', 'UZBEKISTAN', 'Uzbekistan', 'UZB', 860, 998),
(230, 'VU', 'VANUATU', 'Vanuatu', 'VUT', 548, 678),
(231, 'VE', 'VENEZUELA', 'Venezuela', 'VEN', 862, 58),
(232, 'VN', 'VIET NAM', 'Viet Nam', 'VNM', 704, 84),
(233, 'VG', 'VIRGIN ISLANDS, BRITISH', 'Virgin Islands, British', 'VGB', 92, 1284),
(234, 'VI', 'VIRGIN ISLANDS, U.S.', 'Virgin Islands, U.s.', 'VIR', 850, 1340),
(235, 'WF', 'WALLIS AND FUTUNA', 'Wallis and Futuna', 'WLF', 876, 681),
(236, 'EH', 'WESTERN SAHARA', 'Western Sahara', 'ESH', 732, 212),
(237, 'YE', 'YEMEN', 'Yemen', 'YEM', 887, 967),
(238, 'ZM', 'ZAMBIA', 'Zambia', 'ZMB', 894, 260),
(239, 'ZW', 'ZIMBABWE', 'Zimbabwe', 'ZWE', 716, 263);

-- --------------------------------------------------------

--
-- Table structure for table `menus`
--

CREATE TABLE `menus` (
  `id` int(11) NOT NULL,
  `order` int(11) NOT NULL,
  `link` varchar(255) DEFAULT NULL,
  `title` varchar(255) NOT NULL,
  `url` varchar(255) NOT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `menus`
--

INSERT INTO `menus` (`id`, `order`, `link`, `title`, `url`, `icon`, `updated_at`, `created_at`) VALUES
(0, 0, NULL, '', '', NULL, '2017-02-09 09:02:40', '0000-00-00 00:00:00'),
(1, 1, 'About Us', 'About Us', 'about-us', 'info', '2017-02-09 15:04:30', '2017-01-09 13:35:27'),
(2, 3, 'Contact Us', 'Contact Us', 'contact', 'phone', '2017-02-09 15:04:30', '2017-01-05 01:00:00'),
(3, 2, 'Shop', 'Shop', 'shop', 'shopping-cart', '2017-02-09 15:04:30', '2017-01-11 04:15:10');

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `data` text NOT NULL,
  `total` decimal(8,2) NOT NULL,
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `user_id`, `data`, `total`, `updated_at`, `created_at`) VALUES
(1, 7, 'a:2:{s:32:"5ff8cfa8fa603f5746c98a3537f9285b";a:8:{s:5:"rowId";s:32:"5ff8cfa8fa603f5746c98a3537f9285b";s:2:"id";s:1:"2";s:4:"name";s:12:"Solar Bikini";s:3:"qty";i:1;s:5:"price";d:49.990000000000002;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:16:"solar-bikini.jpg";}}}}}}}}s:3:"tax";d:8.4983000000000004;s:8:"subtotal";d:49.990000000000002;}s:32:"577d517cd82b295fc44f2c79c51e36fb";a:8:{s:5:"rowId";s:32:"577d517cd82b295fc44f2c79c51e36fb";s:2:"id";s:1:"5";s:4:"name";s:18:"Bed w/ Built in-TV";s:3:"qty";i:2;s:5:"price";d:8999.9899999999998;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:18:"bedbuilt-in-tv.jpg";}}s:3:"tax";d:1529.9983;s:8:"subtotal";d:17999.98;}}', '21118.46', '2017-01-12 15:56:12', '2017-01-12 15:56:12'),
(2, 7, 'a:4:{s:32:"de2f8adee016dfd4a7f03c3a866062c6";a:8:{s:5:"rowId";s:32:"de2f8adee016dfd4a7f03c3a866062c6";s:2:"id";s:1:"4";s:4:"name";s:18:"Aquarium Labyrinth";s:3:"qty";i:2;s:5:"price";d:6500;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:12:"aquarium.jpg";}}}}}}}}}}}}}}s:3:"tax";d:1105;s:8:"subtotal";d:13000;}s:32:"566a198d9d35520defac395ad651a8cd";a:8:{s:5:"rowId";s:32:"566a198d9d35520defac395ad651a8cd";s:2:"id";s:1:"5";s:4:"name";s:18:"Bed w/ Built in-TV";s:3:"qty";i:1;s:5:"price";d:8999.989999999999781721271574497222900390625;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:18:"bedbuilt-in-tv.jpg";}}}}s:3:"tax";d:1529.998299999999971987563185393810272216796875;s:8:"subtotal";d:8999.989999999999781721271574497222900390625;}s:32:"3fe22e5b957fa7340159f215befbab21";a:8:{s:5:"rowId";s:32:"3fe22e5b957fa7340159f215befbab21";s:2:"id";s:2:"13";s:4:"name";s:11:"Beer Foamer";s:3:"qty";i:2;s:5:"price";d:12.9900000000000002131628207280300557613372802734375;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:15:"beer-foamer.jpg";}}}}}}}}}}}}s:3:"tax";d:2.20830000000000037374547900981269776821136474609375;s:8:"subtotal";d:25.980000000000000426325641456060111522674560546875;}s:32:"5ff8cfa8fa603f5746c98a3537f9285b";a:8:{s:5:"rowId";s:32:"5ff8cfa8fa603f5746c98a3537f9285b";s:2:"id";s:1:"2";s:4:"name";s:12:"Solar Bikini";s:3:"qty";i:2;s:5:"price";d:49.99000000000000198951966012828052043914794921875;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{i:0;O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:16:"solar-bikini.jpg";}}}}}}}}s:3:"tax";d:8.498300000000000409272615797817707061767578125;s:8:"subtotal";d:99.9800000000000039790393202565610408782958984375;}}', '25887.36', '2017-01-25 12:04:16', '2017-01-25 12:04:16'),
(3, 7, 'a:1:{s:32:"f7383b4f5e0da9a2be8c6f301574a7c6";a:8:{s:5:"rowId";s:32:"f7383b4f5e0da9a2be8c6f301574a7c6";s:2:"id";s:1:"6";s:4:"name";s:14:"ChangeIt! Wall";s:3:"qty";i:1;s:5:"price";d:2499.989999999999781721271574497222900390625;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:15:"change-wall.jpg";}}s:3:"tax";d:424.998299999999971987563185393810272216796875;s:8:"subtotal";d:2499.989999999999781721271574497222900390625;}}', '2924.99', '2017-02-20 08:20:05', '2017-02-20 08:20:05');

-- --------------------------------------------------------

--
-- Table structure for table `persistences`
--

CREATE TABLE `persistences` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `preorders`
--

CREATE TABLE `preorders` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `user_ip` int(20) NOT NULL,
  `data` text NOT NULL,
  `total` decimal(8,2) NOT NULL,
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `preorders`
--

INSERT INTO `preorders` (`id`, `user_id`, `user_ip`, `data`, `total`, `updated_at`, `created_at`) VALUES
(1, NULL, 2130706433, 'a:1:{s:32:"e3744daa923e9852526f19f795de740e";a:8:{s:5:"rowId";s:32:"e3744daa923e9852526f19f795de740e";s:2:"id";s:2:"21";s:4:"name";s:15:"Clear Holepunch";s:3:"qty";i:1;s:5:"price";d:9.9900000000000002;s:7:"options";O:39:"Gloudemans\\Shoppingcart\\CartItemOptions":1:{s:8:"\0*\0items";a:1:{s:5:"image";s:19:"clear-holepunch.jpg";}}s:3:"tax";d:1.6983000000000001;s:8:"subtotal";d:9.9900000000000002;}}', '11.69', '2017-02-20 16:16:46', '2017-01-05 10:01:12');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `categorie_id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `article` text NOT NULL,
  `image` varchar(255) NOT NULL,
  `url` varchar(255) NOT NULL,
  `price` decimal(12,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `categorie_id`, `title`, `article`, `image`, `url`, `price`, `stock`, `updated_at`, `created_at`) VALUES
(1, 1, 'Pencil Printer', 'You''ll never throw away another pencil stub and never buy another ink cartridge. The'' pencil printer'' separates the wood from pencils and uses the lead to print documents. There''s even a built-in eraser component that allows you to remove text from a page and reuse the paper, so you''ll be saving money'' and'' trees.', 'pencil-printer.jpg', 'pencil-printer', '119.99', 292, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(2, 1, 'Solar Bikini', 'When you''re wearing a solar-powered bikini, you can spend the entire day at the beach grooving to your favorite tunes and never have to worry about your smartphone battery dying.''The swimwear is designed with photovoltaic film panels and a USB connection, the male version of the''solar bikini''is coming soon.', 'solar-bikini.jpg', 'solar-bikini', '49.99', 700, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(3, 1, 'Water Lamp', 'The Water Lamp has the interesting ability to generate light if you fuel it with water.\r\nThe water combines with a hydroelectric battery to generate an electrochemical reaction that lights it up.', 'water-lamp.jpg', 'water-lamp', '79.99', 438, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(4, 2, 'Aquarium Labyrinth', 'Give your home some real character and show off your fish with the Labyrinth Aquarium. This Labyrinth Aquarium is designed for tropical fish and includes lights, filters, air pumps, cleaning supplies, and makes a cool gift idea for any home.', 'aquarium.jpg', 'aquarium', '6500.00', 5, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(5, 2, 'Bed w/ Built in-TV', 'The all-in-one bedroom entertainment center has so many awesome features that it''s hard to imagine you''d ever leave bed again with this at home. In fact, as long as you''ve got a phone by the bed and the pizza guy is willing to deliver straight to your bedroom, you''ll never need to leave it.', 'bedbuilt-in-tv.jpg', 'bedbuilt-in-tv', '8999.99', 4, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(6, 2, 'ChangeIt! Wall', 'Change It!, a simple, ingenious way to create any design you want on your wall. You can arrange the pixel blocks to form fields of color, rainbows, patterns, and even your favorite video game characters if you want', 'change-wall.jpg', 'change-wall', '2499.99', 14, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(7, 2, 'Electrolux Fireplace', 'The beauty of the Electrolux Fireplace is that it stands out as this opaque ceramic column that slowly turns translucent to transparent, as the flames flare up. Upon cooling down the column goes back to being the white shaft it was.', 'electrolux-fireplace.jpg', 'electrolux-fireplace', '349.99', 100, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(8, 2, 'Cloud Sofa', 'The levitating, heavenly-looking pillow achieves its state of gravity defiance with the help of magnets. A magnetic force generated by the bottom base pushes against and holds steady the cloud, even when persons of average weight are sitting or lying on top of it', 'cloud-sofa.jpeg', 'cloud-sofa', '22500.99', 2, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(9, 2, 'Identita Home Cinema Chair', 'Identita is a chair designed for a home cinema. Replace your traditional lounge chair for a seating solution that is completely adjustable and ergonomic.', 'ergo-chair.jpg', 'ergo-chair', '5199.99', 7, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(10, 2, 'Lamp Torch', 'A simple and and beautiful lamp, that can be lifted out of the stand and used as a portable lighting solution when needed.', 'lamp-torch.jpg', 'lamp-torch', '159.99', 219, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(11, 2, 'Smart Lock', 'Smart locks are so handy '' use your phone to let the dog walker in while you''re on vacation, or unlock the door from your car before carrying in groceries.', 'smartlock.jpg', 'smartlock', '259.99', 135, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(12, 2, 'Smart Coffee Table', 'This is the wooden coffee table that incorporates a fully  a 32" touch screen. With a 178'' viewing angle, it is ideal for viewing enlarged photos or maps, or allowing multiple users to comfortably view the same data from the couch. The tempered-glass surface can hold books, dishes, remote controls, and its IP34 water rating makes it safe for everyday splashes and spills.', 'smart-table.jpeg', 'smart-table', '6999.99', 5, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(13, 3, 'Beer Foamer', 'The Beer Foamer gets you as close to the Pub experience as you can without leaving your home. Denser beer foam will significantly increase the taste, aroma and feeling of the beer - just like beer fresh from the tap.', 'beer-foamer.jpg', 'beer-foamer', '12.99', 2694, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(14, 3, 'Clear Toaster', 'Another excellent product '' the transparent glass toaster! No longer must you tweak your heat and timer settings, now you can just turn on the toaster and literally watch it heat up to a perfect golden brown toast.', 'clear-toaster.jpg', 'clear-toaster', '79.99', 438, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(15, 3, 'Evak Container', 'Air takes out the freshness''so EVAK takes out the air. The longer your food is exposed to air, the faster it loses flavor. Glass containers with air-tight lids are readily available, but they trap stale air in with your precious food. Evacuate the air and keep your food fresher, longer.', 'evak-container.jpg', 'evak-container', '25.99', 1347, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(16, 3, 'Electrolux Memory Coffee Maker', 'A small but important part of many people''s lives is the intimacy of having a barista who remembers who you are and more importantly how you have your coffee. Memory is a coffee maker that uses hand print recognition to make the right cup of coffee for the right person. Whether you want weak, medium or strong coffee or maybe you prefer an espresso to a ristretto. Any way that you might think the perfect cup of coffee is made, Memory will remember every time. You tell it what you want, it scans your hand and the next time you want that exact same cup of coffee Memory is ready and waiting to serve it to you.', 'handprint-coffee.jpg', 'handprint-coffee', '137.99', 254, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(17, 3, 'Self Stirring Mug', 'now you can watch as your morning coffee is self stirring by the one touch of a button.', 'self-stirring-mug.jpg', 'self-stirring-mug', '7.99', 4380, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(18, 3, 'Sensor Trash Can', 'Effortlessly toss out scraps as you prepare dinner: just a wave of your hand near this can and the top flips open for you.', 'sensor-trash-can.jpg', 'sensor-trash-can', '63.99', 547, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(19, 3, 'Family Hub', 'The Family Hub is a revolutionary new refrigerator with a Wifi enabled touchscreen that lets you manage your groceries, connect with your family and entertain like never before. It has three built-in cameras that take a photo every time the doors close. You can use your phone to access photos from anywhere, so you always know what you have and what you''re missing.  When it''s time to get groceries, order them directly from the touchscreen with apps like Groceries by MasterCard. You can even discover new recipes and receive notifications when food is about to expire. Coordinate everyone''s schedules, leave notes and reminders, and show off pictures of your latest family vacation. The Family Hub is at the center of it all.', 'smart-fridge.png', 'smart-fridge', '2159.99', 16, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(20, 3, 'Smart Knife', 'The Smart Knife, a digital, rechargeable knife with a ''sensor-equipped blade'' that doubles as a touch screen. The blade contains negative ions that will allegedly prevent foods from oxidizing, and it can also display information about the freshness, potential bacteria contamination, and nutritional content of whatever it''s chopping.', 'smart-knife.jpg', 'smart-knife', '130.00', 269, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(21, 4, 'Clear Holepunch', 'The Transparent Punch allows you to see where exactly you will be punching the hole in a paper. The red ring guides your placement and saves you from doing a shoddy job.', 'clear-holepunch.jpg', 'clear-holepunch', '9.99', 3504, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(22, 4, 'Date Stapler', 'DateStapler is a stapler that can print date on the paper at the time you staple. Nowadays, many files and documents mess up our daily life. Usually, we print the documents and then staple papers up. And also we often sort the documents by date. But if there is no date on the preface paper, it is hard for us to remember the printed date and inconvenient to mark date on each documents. So DateStapler helps us to sort and manage the documents by date easily. .', 'date-stapler.jpg', 'date-stapler', '27.99', 1250, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(23, 4, 'Dividing Printer', 'Ever had to print large documents? They''re quite annoying. Ever had to print multiple copies of large documents?? They''re an absolute nightmare! While most printers allow you to ''collate'' prints, there''s always a 1% (usually more) chance that one rogue paper finds itself in the wrong pile. The Dividing Printer, as its name suggests does something simple yet smart. It mounts the printer on a rail and allows the printer to move left or right while printing documents. What this does is that it allows the printer to create actual, physical piles of paper that have been segregated from the get go. The elegance of this solution lies in the fact that it doesn''t change what the printer fundamentally does. It just adds a small bit of innovation elsewhere to solve the problem!', 'dividing-printer.jpg', 'dividing-printer', '125.99', 278, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(24, 4, 'Document Extractor', 'The Document Extractor is combination of printer, scanner and monitor''all in one. Highly useful and practical, this unique monitor is a screen that doubles up as a printer. Your desk will appear more organized, spacious and trendy without the extra set of printing and scanning devices. The Document Extractor saves space, time and resources as well, such as ink or toners. This tech device also stacks the printing paper away from the view, piling neatly away at the back.', 'monitor-printer.jpg', 'monitor-printer', '299.99', 117, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(25, 4, 'Invisible Ink Pen', 'This is a great gadget for kids but it is guaranteed that adults are going to love it as well. You can write with your invisible ink pen and then read the secret message with the help of the UV light integrated into it. Imagine the look on your kid''s face when you will present him or her with such a cool gift on Christmas morning. It will be priceless!', 'invisible-ink-pen.jpg', 'invisible-ink-pen', '5.99', 5843, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(26, 4, 'Laser Scissors', 'Quit making those sloppy cuts with your normal scissors '' now you can cut stuff up with laser like precision thanks to these laser guided scissors! These scissors are perfect for arts and crafts, gift wrapping, scrap booking, and even cutting hair.', 'laser-scissors.jpg', 'laser-scissors', '12.99', 2694, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(27, 5, 'Hoverboard', 'The future is now. Finally no Photoshop, no video editing required to float 1 inch above ground with a hoverboard. This is the real thing. The hoverboard uses 4 engines to make it stable, and unlike a skateboard, you''d be able to ride it virtually anywhere! Get ready for some serious fun.', 'hoverboard.jpg', 'hoverboard', '19999.99', 2, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(28, 5, 'Jetbike', 'The JetBike is a jet powered flying bike powered by an alternative method of propulsion. No more traffic on the ride to work everyday, elegantly flying above.''', 'jetbike.jpg', 'jetbike', '34499.99', 1, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(29, 5, 'Lumos Helmet', 'Re-imagining the humble bicycle helmet. Lumos is the world''s first smart bike helmet that beautifully integrates lights, hard brake, turn signals, and helmet into a single cohesive whole. An elegant solution for your safety and visibility. Super bright white LEDs in the front and super bright red LEDs in the rear provide over 80 lumens of illumination to ensure that you stand out on the road.', 'lumos-helmet.jpg', 'lumos-helmet', '329.99', 106, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(30, 5, 'Zero Breeze Portable Air Conditioner', 'The Zero Breeze is the World''s First Portable, Smart, Multifunctional Air Conditioner that also functions as a bluetooth speaker, a night light, and a smartphone charging station. Zero Breeze is capable of cooling a 50 square feet room down to 44 ? making it perfect for your home, office, tent, RV, college dorm, and so much more.', 'portable-ac.jpg', 'portable-ac', '129.99', 269, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(31, 5, 'iWaveCube Portable Microwave', 'Having your own microwave in your office desk is really cool, making tea or snacks is easier without having to go to pantry. The iWaveCube can help you bring your dream come true, weighs just about 12 pounds, one cubic foot with built-in carry handle for portability.', 'portable-microwave.jpg', 'portable-microwave', '859.99', 41, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(32, 5, 'Landroid Robot Lawnmower', 'Struggling to find a convenient time to mow the lawn? The Landroid lets you customize mowing schedules, even on a daily basis. It also runs up to seven days each week, ensuring your lawn is well-maintained at all times. Unlike traditional mowers, which often remove large amounts of grass at a time, this mower gives the grass a trim on a routine basis. Another highlight is its minimal noise operation, making it easy to mow the lawn during the day or at night without disturbing the neighbors.', 'robot-lawn.jpg', 'robot-lawn', '999.99', 35, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(33, 5, 'Smart Soccer Ball', 'Smart Soccer Ball is the worlds first truely "smart" soccer ball which\r\ncontains motion detection technology that records force of impact, spin, position, trajectory, number of ball passes, number of ball touches, play time, and reports directly to your mobile device in real time, making it your own personal coach on the field. All data is saved and accessible on the app, so you can review, share, and let others view your game stats. Connect a headset and get cues as you play!', 'smart-ball.jpg', 'smart-ball', '699.99', 50, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(34, 5, 'Solar Tent', 'This is a solar-powered beach concept tent specially designed for the British coast, so it''s a hardy little contraption. It''s made from photovoltaic fabric, which stores energy and can power gadgets.', 'solar-tent.jpg', 'solar-tent', '499.99', 70, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(35, 5, 'Cyclotron Spokeless Bike', 'The next phase in bicycle technology has arrived with the Cyclotron spokeless smart bike. Apart from the futuristic design with spokeless wheels and airless tires, this app controlled ride features everything from a chainless transmission to a LED rim light.', 'cyclotron.jpg', 'cyclotron', '1549.99', 23, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(36, 5, 'Steak Thermometer', 'Finding the sweet spot between medium and medium rare can now be done from up to 150 feet away. Insert a thermometer into your steaks and then walk away, knowing alerts will be sent to your phone when your food is cooked to perfection.', 'steak-thermometer.jpg', 'steak-thermometer', '179.99', 194, '0000-00-00 00:00:00', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `reminders`
--

CREATE TABLE `reminders` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(11) NOT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `completed` tinyint(1) NOT NULL,
  `completed_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `reminders`
--

INSERT INTO `reminders` (`id`, `user_id`, `code`, `completed`, `completed_at`, `updated_at`, `created_at`) VALUES
(1, 7, 'Zz0RdY8iRLQEIy1qoa0ocA9NbAJE595Z', 1, '2017-01-25 22:00:10', '2017-01-25 22:00:10', '2017-01-25 21:58:34');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) CHARACTER SET latin1 NOT NULL,
  `password` varchar(255) CHARACTER SET latin1 NOT NULL,
  `address` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `city` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `zip` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `country` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `phone` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `updated_at` varchar(255) CHARACTER SET latin1 NOT NULL,
  `created_at` varchar(255) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `first_name`, `last_name`, `email`, `password`, `address`, `city`, `zip`, `country`, `phone`, `updated_at`, `created_at`) VALUES
(1, 'Tara', 'Graham', 'vulputate.ullamcorper.magna@commodo.ca', '$2y$10$8NobUZFhLq0LWWtYQ9Fasep8/EGsJxRx1zkK.pAvHfbdFN.F6VT4a', '2339 Felis, Ave', 'Posina', '7110', 'HONDURAS', '+ 504-343434343434', '2017-02-18 16:55:53', '2016-06-09 23:39:26'),
(2, 'Damian', 'Newman', 'lobortis@orcilobortisaugue.com', '$2y$10$3f7LRu6K99xDvjvFtFyLre0Ff0gnGRQ6FFEUFDeag6ylqQO8Bxg7S', '1326 Duis Street', 'Alma', '62621', 'Mayotte', '1-841-978-4751', '2017-04-02 08:06:01', '2017-10-08 06:26:35'),
(3, 'Martina', 'Drake', 'mattis@Pellentesquetincidunt.co.uk', '$2y$10$pOo1as/Auqd3PYrMidY/W.gmYsakl1rVhqKgGHRErNeescu0H7Lee', '2134 Sodales Rd.', 'Meer', '686547', 'Marshall Islands', '607-2673', '2016-07-13 14:16:48', '2016-12-20 06:12:35'),
(4, 'Karyn', 'Caldwell', 'iaculis@elit.edu', '$2y$10$n26qTQzLsx3hcpta8mMkKOvP1BgbXmSSGOzmhWLEgSZOyuIdGo0oi', '3952 Neque. Road', 'Lens-Saint-Remy', '092891', 'Pakistan', '1-667-357-4927', '2017-01-08 01:05:22', '2016-07-09 16:59:29'),
(5, 'Zenaida', 'Bell', 'Pellentesque.ultricies@purusac.co.uk', '$2y$10$5zo8X9i1LDOwM0aeEcszPe6hVF5d1E2uccyHjzV45.NTtmJZXnGOq', 'Ap #930-1227 In Rd.', 'Maidstone', '72504', 'Syria', '1-272-555-2279', '2016-11-28 14:32:36', '2017-04-19 14:29:58'),
(6, 'Quail', 'Delacruz', 'mi.ac.mattis@Nuncquis.org', '$2y$10$SefBLOdA0lUT1SG8rWyJrOopASNqHQ9I70dpm3Thbt.Z0q4nmR9Ri', 'Ap #879-8378 Maecenas Road', 'Savannah', '50237', 'Angola', '1-966-482-1993', '2016-12-23 10:42:23', '2017-11-24 22:52:26'),
(7, 'Alon', 'Kochav', 'alonkochav@gmail.com', '$2y$10$N33pi6UgmAnD0RWcxLogROvgMvzTa3PRB8CsRNRaWxx//SmvcKOnq', '5 Shoham Streets', 'Ramat Gan', '52220', 'ISRAEL', '+ 972-54-4777469', '2017-02-18 10:37:24', '2016-12-12 07:48:21'),
(8, 'Francesca', 'Larsen', 'augue.ac.ipsum@a.ca', '$2y$10$OONF7wG0fUPuUnljZdDfje1e8rqN/b.Xejube0CmVuXQ7kAeX3XsC', '570-8998 Id Ave', 'Cheyenne', '06049', 'Trinidad and Tobago', '1-229-835-8552', '2017-03-07 21:25:54', '2016-05-29 07:17:55'),
(9, 'Gay', 'Mclaughlin', 'blandit@eleifendvitaeerat.com', '$2y$10$YPMWp9DGTnrU/2CBVwFnR.NgBi0o1FnjvsIccjZ6zgZP/4Jw9oFeW', '317-1459 Non, Avenue', 'Albano di Lucania', '268894', 'United Arab Emirates', '117-8460', '2016-03-23 15:27:37', '2017-03-25 13:41:28'),
(10, 'Samantha', 'Wells', 'ut.odio@pedeblanditcongue.org', '$2y$10$OVQ.0RZHh0UspNjHy.F8aeIs/oJNbNwaiRTHTXRY7Cqy92T73eBtS', 'P.O. Box 356, 4968 Pharetra St.', 'Ekeren', '6757MB', 'Mayotte', '1-176-364-9793', '2017-10-10 18:50:34', '2017-03-09 02:04:00'),
(11, 'Briar', 'Hatfield', 'senectus.et@rutrum.org', '$2y$10$Og0p4To6BeCsdhTVzN4Q0OJuWuVw2/.3ddwxDsVn.RjlT3BfhbUBi', 'Ap #687-6743 Fringilla Street', 'Macklin', '2930', 'Liberia', '1-795-677-7065', '2017-05-16 15:15:19', '2017-05-20 10:59:24'),
(12, 'Oren', 'Wong', 'ut.sem.Nulla@neceuismod.edu', '$2y$10$Cq02FJFlFZFcmjStvgik.Oxo.HNHLz1qfCB19ysQ4CGyIcSmpw7Em', '694-9625 Lobortis Street', 'Anglet', 'PT9R 6OI', 'Taiwan', '1-740-967-7534', '2016-07-25 13:42:47', '2017-06-27 09:03:49'),
(13, 'Laurel', 'David', 'luctus.Curabitur@Crasvehiculaaliquet.edu', '$2y$10$oM0smO2rTpkgw.VSeZeb..Cm5el6eM1AAZZF8WKLud.bSfr2fTUP6', '789-3480 Lectus Rd.', 'Oban', '35355', 'Botswana', '1-947-675-7446', '2017-01-17 20:30:07', '2016-10-07 13:46:41'),
(14, 'Len', 'Odonnell', 'Quisque@nisiAenean.ca', '$2y$10$IbnmcjPCth0xe48Y6sAeVu2Td6z3oPtwDuu6EfkA3X72qOg6bRN.6', '1092 Vulputate Road', 'Mount Pearl', '7369', 'Tunisia', '1-356-119-3715', '2016-08-01 00:09:05', '2017-12-04 01:20:06'),
(15, 'Lacey', 'Ballard', 'sociis@justo.co.uk', '$2y$10$4Ljg0.Xzhheg2cxngbYAo.rz5is.sSk2nXFQW73WNSoRID6zc0cJK', '629-7759 Donec Rd.', 'Kawawachikamach', '1386', 'Grenada', '1-429-802-8060', '2017-08-23 20:33:31', '2017-03-29 18:11:38'),
(16, 'Patricia', 'Stout', 'tincidunt.tempus.risus@mifringillami.edu', '$2y$10$2WiLKVESDSZPWFC6Wu98p.QBhCm2S0EFwL.RfYpMXpXM970i0GWRq', '460-9734 Proin Rd.', 'Patos', '40841', 'Cambodia', '1-603-649-0553', '2015-12-25 01:36:17', '2017-06-21 08:44:40'),
(17, 'Lee', 'Compton', 'fermentum@portaelita.ca', '$2y$10$nJ9SAlsjtX/P7PthlhcjruIiHGhza1LlWnCxTGk3IpaRVDIJVP22G', '277-8789 Ipsum Street', 'Poppel', '25217', 'New Zealand', '978-2568', '2016-04-25 13:19:59', '2017-03-16 00:54:18'),
(18, 'Elijah', 'Roach', 'Nulla.tincidunt@Integeraliquam.net', '$2y$10$qK5I6WsRGXsofNYecn95ie2/RjbTtWa6bbF.rBJWM8yJYLwQaNQiW', 'P.O. Box 305, 6501 Suspendisse Street', 'Ahmedabad', '04271', 'Papua New Guinea', '1-682-216-6069', '2017-07-09 05:53:54', '2016-01-24 23:18:50'),
(19, 'Curran', 'Foley', 'rutrum@anteiaculisnec.com', '$2y$10$YobYEJEvYnsVdcXa2.2eAO4VuSHZ36VIfvQ7v3FflPhkBBuSMFoKq', '140-4144 Lectus. Rd.', 'Fochabers', '82009', 'Barbados', '312-0207', '2017-03-20 12:57:32', '2017-02-07 22:32:26'),
(20, 'Kirsten', 'Bowers', 'ornare.facilisis@ipsum.com', '$2y$10$7m1n6pEZNqP/8yXc1gvIz.EV1m2B32YfLp1XpQkURQme.Iyg4Ho1S', '797-2990 Id, Av.', 'Jennersdorf', '63794', 'Åland Islands', '989-7839', '2016-01-09 02:01:07', '2017-03-15 05:32:04'),
(21, 'Eugenia', 'Merritt', 'eget.metus.In@cursusetmagna.net', '$2y$10$1GmbQNwO5xnRyrfiBhBDQOQYoNjxWmxuxH/2/0NqRAcxPmDkeO9t.', 'P.O. Box 158, 799 Vestibulum Rd.', 'Saint-Herblain', '796548', 'Monaco', '206-1344', '2016-01-15 00:46:36', '2017-12-07 15:17:01'),
(22, 'Kibo', 'Mccullough', 'semper.rutrum@nibh.org', '$2y$10$AVLHC1w6t2TYDsDNSFsd3uHKZSSg1mYeA6YHmHzvKHBS959UMSUx2', 'Ap #773-289 Per Av.', 'Haut-Ittre', '669274', 'Germany', '315-8150', '2017-05-15 20:59:28', '2016-01-22 03:57:14'),
(23, 'Rylee', 'Dominguez', 'amet.consectetuer.adipiscing@vehicularisusNulla.com', '$2y$10$3AfFJE7ux9hwtfM8epd3H.gYjwc3BCANm6BFTMRjgAWjy0dFSEqsm', '2280 Ipsum Road', 'Halle', '34483', 'Macedonia', '972-2893', '2017-03-24 20:02:48', '2017-10-24 10:35:51'),
(24, 'September', 'Christian', 'urna.Ut@iaculisaliquet.edu', '$2y$10$.Q96nx7UrPPtAOx.iwamNOrq3W5IyhI8YaTQU2hsvhF/b4fU.QFWK', 'Ap #361-6164 Dui. St.', 'Dornoch', '04-352', 'Liechtenstein', '1-293-128-8024', '2017-09-15 03:38:05', '2016-03-15 23:45:53'),
(25, 'Madonna', 'Dawson', 'enim@nec.org', '$2y$10$JCsQNLldnTz7XgT0rf1Ae.he/bPGJ..FW./TK12oZr1IpQIscZJQK', 'P.O. Box 704, 6809 Sit Ave', 'Orhangazi', '21175', 'Dominican Republic', '1-552-509-6386', '2016-03-01 02:32:21', '2016-08-31 07:50:25'),
(26, 'Axel', 'Perkins', 'non.feugiat@nisiMaurisnulla.com', '$2y$10$AnvM/BV8BnHM8JkN0lJEnOIgLJWvJ.GR14C/qz9ZM3zi431ltppJ.', 'Ap #944-5844 Ornare Rd.', 'Burcht', '70209-399', 'Kiribati', '1-335-683-5113', '2017-10-21 10:35:56', '2017-01-01 08:01:52'),
(27, 'Desiree', 'Dejesus', 'pharetra.ut@volutpat.org', '$2y$10$vJvseR3l0QcxK7y7vQlpceNOicr9jNUZL8KR6jfrIDI4yKsRDmoai', '378-3729 Sit Road', 'Orilla', '31396', 'Macedonia', '474-8636', '2017-07-04 07:50:12', '2017-07-14 21:33:45'),
(28, 'Nero', 'Shields', 'arcu.Sed@mollis.ca', '$2y$10$sTRpwnFKTLBAXtpbQv0mbujEV.isa5hueWFx5aXCUC6bNWH/gCWrO', 'Ap #321-768 Lorem St.', 'Portsmouth', '207896', 'Guatemala', '506-3085', '2016-07-31 14:15:12', '2017-10-25 19:45:17'),
(29, 'Portia', 'Porter', 'sed.pede.nec@euneque.net', '$2y$10$Sj4FOyJt711Q/7OzmzkaYuIwkNVIiJR7cinkPpHLqQ2BcwHI24zHm', 'P.O. Box 547, 3605 Dictum St.', 'Munich', 'Y74 7PH', 'United Arab Emirates', '515-4125', '2017-04-01 11:56:15', '2016-08-02 15:20:41'),
(30, 'Kaden', 'Ballard', 'lectus@luctusvulputate.co.uk', '$2y$10$h/fzSzi1P7Ubl6eAwcWo9ueR1Hw5Xrpzs148A7EmwSVm4GDYfBDde', 'P.O. Box 264, 8483 Lobortis. Avenue', 'Geer', 'VF3Z 0PB', 'Brazil', '782-4659', '2017-09-14 17:24:48', '2017-11-30 02:39:31'),
(31, 'Beck', 'Gillespie', 'magnis@aclibero.edu', '$2y$10$vKwi18iqqnTSm0HyylkqLOW3TyVq25o2BvGBlrWMTkUpsMBidGBFG', '750-528 Vitae Av.', 'Rabbi', '00142', 'Lebanon', '1-887-469-4687', '2016-01-08 14:07:33', '2017-06-05 21:40:20'),
(32, 'Kalia', 'Willis', 'feugiat.nec.diam@Donecestmauris.co.uk', '$2y$10$cU6.d4gBZOfGB/tvj9QQVeEesiQvb0z7xICeooi6l.EExayJ9G5W.', 'Ap #184-1278 Consequat St.', 'Halifax', '33880', 'Bolivia', '1-549-786-1131', '2016-03-14 20:44:03', '2016-10-11 03:36:58'),
(33, 'Ivana', 'Zimmerman', 'Nulla.facilisi@justositamet.org', '$2y$10$MANE2LltxNNdVTIrlbsMbuU4Cxq0MhNBsV4TpjLuliKi4fUUQaGsa', '9473 Ligula. Avenue', 'Kidderminster', '419074', 'Mexico', '1-142-180-8209', '2017-06-01 22:41:40', '2017-10-06 01:53:41'),
(34, 'Farrah', 'Dudley', 'dui@senectusetnetus.org', '$2y$10$E5C6I/.Yv/yxIfOgd6uOcuRp6JJN9qZFPihnhbDR2RScNPHl1/reK', '2744 Nibh. St.', 'Nelson', '32169', 'Bermuda', '1-886-426-6301', '2017-04-15 00:02:06', '2017-05-15 16:05:42'),
(35, 'Tatyana', 'Velazquez', 'Duis.volutpat@purusMaecenas.edu', '$2y$10$nhZ7NvzsNBQ9H3Ck.9Sm6uwXTVIouRplku1mUrHg/qS80NenBUjtO', '7755 Consequat St.', 'Borghetto di Borbera', '53778-378', 'Mali', '1-945-602-2295', '2016-05-25 12:26:06', '2017-11-07 13:15:34'),
(36, 'Quemby', 'Sparks', 'ullamcorper@sit.com', '$2y$10$mNkG8X42kOeaWd83DJyVA.41u6QA6x8YU2ybJZE3OVNFG9Xr1Sste', 'Ap #544-9901 Dictum Av.', 'Guarulhos', '76212', 'Denmark', '703-4930', '2017-07-31 19:20:29', '2017-01-18 14:51:10'),
(37, 'Kerry', 'Paul', 'auctor@dui.co.uk', '$2y$10$7w8Vk0iIISyZ8T05LTwmn.4QPhnj2NIbNn6Y9I6tTJ27JIahcOkv2', 'P.O. Box 481, 3504 Quisque Street', 'San Fernando', '87146', 'Sierra Leone', '629-8110', '2017-07-24 16:06:50', '2017-10-29 22:45:58'),
(38, 'Carly', 'George', 'tincidunt.congue@nisl.net', '$2y$10$GUN52TnHiRKc0GUNoIc8nOdGFejSsMnE.ee0NgnN/8idjVw6EP4cO', 'P.O. Box 731, 3345 Augue Ave', 'La Roche-sur-Yon', '88-656', 'Norway', '258-3080', '2016-07-12 22:08:54', '2017-05-21 14:32:25'),
(39, 'Ethan', 'Foreman', 'odio.a.purus@quamvel.com', '$2y$10$.TIxHNTVGTsBaqLGJ.5kHOdWAGerLNCIEdSuxAVGZtCjxs62ruoEa', 'P.O. Box 985, 198 Dignissim. Rd.', 'Coatbridge', '7177', 'Senegal', '487-9955', '2016-08-10 07:57:49', '2016-05-17 09:48:54'),
(40, 'Cruz', 'Poole', 'dui.Suspendisse.ac@tinciduntvehicularisus.ca', '$2y$10$.6cgh0pb35ei5JxENK3E.ubMCC9A4pcLRz2vpmfKPWehpftVxsP.C', 'P.O. Box 288, 2151 Mauris Road', 'Kasteelbrakel', '72531', 'Israel', '287-0477', '2017-07-08 14:28:43', '2016-11-27 19:19:28'),
(41, 'Fuller', 'Clayton', 'dictum.mi.ac@a.org', '$2y$10$dblg.sufx.9O1uiDJeBJTeThcS7u7mC24RA5l57XVvpOINOg17/QC', 'P.O. Box 935, 1881 Pharetra. Rd.', 'Trivigno', '04471', 'Norfolk Island', '1-928-764-3616', '2017-09-02 17:57:48', '2016-08-26 03:18:22'),
(42, 'Carlos', 'Fletcher', 'gravida@fringillacursus.net', '$2y$10$jJpf3jJ/VoW9sbcbbZbBteSRbjjTYEd2gWiTv1jSmVn1XW38lBcm2', '320-2703 Aliquet Rd.', 'Oostkerke', '2782', 'Brunei', '151-4238', '2016-01-11 17:10:01', '2017-11-22 09:01:06'),
(43, 'Alexis', 'Rivers', 'pede.nec.ante@velitinaliquet.com', '$2y$10$2yQbycaCZdBFofPxHDW/mOL/pqHimIy9FCMkiYbpyGQjD0XWEdsMe', '6157 Justo Avenue', 'Baton Rouge', '8036', 'Wallis and Futuna', '1-541-795-9654', '2017-06-29 14:11:21', '2015-12-29 21:11:15'),
(44, 'Leandra', 'Finley', 'in.felis@egetmollislectus.ca', '$2y$10$fC5HEYlvzUXHKLCwr41LteKAv2Boqrk.1LTU1hZ5GONklsB0DeVLy', '603-800 Et, Rd.', 'Ebenthal in Kärnten', '347082', 'Jersey', '1-968-495-5586', '2017-01-24 20:34:23', '2017-06-17 22:31:44'),
(45, 'Juliet', 'Greer', 'metus.In@diamPellentesque.net', '$2y$10$sdUGVpRpJQL8wvhEC8g5pOt.gTynOoBR.omaweR9xtoThJ8I3RAP2', '3284 Metus. Av.', 'Jhelum', '760614', 'Jersey', '829-9618', '2017-12-21 23:24:36', '2017-04-26 05:03:41'),
(46, 'Trevor', 'Palmer', 'est.congue@leo.net', '$2y$10$jiqbluBA/uxN/ZELj/GBDO33fz306TveC87BqTfMrfghGUzKoHO26', '710-9452 Egestas. Avenue', 'Slough', '7975', 'Samoa', '1-409-446-9768', '2017-07-14 04:54:43', '2017-01-17 20:33:44'),
(47, 'Charlotte', 'Ruiz', 'Nulla.interdum@felisullamcorperviverra.co.uk', '$2y$10$CzSD93ZWqYNpkcdVLhdPVeC6I9mTdwI2VdTSLb2o8Xtvo70r38mHi', '7794 Facilisi. St.', 'Barahanagar', '8897', 'Estonia', '447-8930', '2017-12-10 18:08:11', '2016-11-23 05:15:54'),
(48, 'Kirby', 'Velazquez', 'Donec.est.Nunc@metusIn.co.uk', '$2y$10$G0IoP/07akGUu24OYLrhjO2zlbAICgNIDu1nQH5vFVxHKE6VvOY.y', 'P.O. Box 798, 5769 Ac Rd.', 'Warrington', '27378', 'Denmark', '203-1256', '2016-11-07 21:03:46', '2016-09-02 16:16:54'),
(49, 'Hu', 'Spence', 'odio.tristique@ultricesVivamusrhoncus.co.uk', '$2y$10$jRTlW6ODOa2FnWKYNnSH/O74y.5h.ZD/AWLDB.GNQZ59DPWEYdJRK', '6539 Ullamcorper. Avenue', 'HavrŽ', '243553', 'Pitcairn Islands', '600-5821', '2017-03-08 16:08:59', '2016-02-17 15:55:35'),
(50, 'Cally', 'Sharp', 'iaculis.quis@NulladignissimMaecenas.com', '$2y$10$ax2UNrr629bBgvcT3i22a.iJL49UWJ.WYHWy.SQjz4TLbNkeF0qfK', 'P.O. Box 367, 2615 Non Av.', 'Chapra', '9681', 'Slovakia', '134-3770', '2016-07-08 10:36:29', '2016-09-07 23:48:41'),
(51, 'Garrett', 'Harris', 'Phasellus.in.felis@vestibulum.org', '$2y$10$CvQChRn90xe.YgdjwOZlLOLHtCOoamSC6X3Vuey2bE9hh1ChVhk4K', '3074 Porttitor St.', 'Loy', '25-902', 'France', '1-891-836-0282', '2017-05-18 15:17:19', '2017-02-05 09:36:48'),
(52, 'Clio', 'Hardin', 'tempus.lorem.fringilla@Aliquamerat.ca', '$2y$10$fYlZjBK.ohf.VMNNaWZVrOCu5ypuiPU8dju1xbuUDOr37JucYkxRa', 'Ap #587-4060 Consectetuer Avenue', 'Quilpué', '35133', 'Russian Federation', '1-830-222-8284', '2016-11-19 18:55:19', '2017-05-26 16:41:29'),
(53, 'Acton', 'Potter', 'interdum.libero@Duis.org', '$2y$10$cvjDOjQ9N1ox94ZiCYKzruQuMbrjv1zhAr7/lwTy68zsdpbQ0ni6a', 'P.O. Box 193, 8809 Fringilla Ave', 'Breton', '96807', 'Mongolia', '1-969-453-2876', '2016-06-11 06:12:45', '2017-01-10 03:44:05'),
(54, 'Eric', 'Murray', 'natoque.penatibus@Sed.ca', '$2y$10$CYCDrL4eFvALTvnEkc9FZ.HbZp1i7t9gzYIOxSdO6rYwisZkZU8ba', 'Ap #182-8980 At, Road', 'Louisville', '23-492', 'Cook Islands', '119-3018', '2017-01-29 16:59:55', '2016-07-25 05:52:20'),
(55, 'Jeanette', 'Higgins', 'nonummy@mienimcondimentum.co.uk', '$2y$10$P/s9GUeYgd5bmj0fHoDeKulxV.1f85o8Vn4tRTGD19casUqgMoPpG', '601-5547 Suspendisse Rd.', 'St. Catharines', '53695', 'Equatorial Guinea', '192-0581', '2016-06-22 13:36:47', '2017-11-10 13:04:14'),
(56, 'Skyler', 'Thornton', 'non.quam@hendreritaarcu.net', '$2y$10$xeARmXEWm/ZaN1EJlpIAuemSbI0jdjkEvNdogtsXaOl.kEWpl00x6', '642-6515 Nunc Rd.', 'Gasteiz', '9426', 'Saudi Arabia', '1-905-655-2903', '2017-03-23 07:47:40', '2017-02-19 14:28:19'),
(57, 'Buffy', 'Miller', 'faucibus@nisiMauris.ca', '$2y$10$KPAndD1zbucfVN3CyWunKOfF4axIh/.J4AF2dw3bnwk8D3.nPcRji', 'Ap #286-3427 Natoque Av.', 'Suruç', '86306', 'Honduras', '1-870-393-8416', '2016-06-22 04:24:38', '2016-07-29 09:28:19'),
(58, 'Autumn', 'Livingston', 'nec@a.co.uk', '$2y$10$ICyF3U5CjO.Su40L2ekAPOI6VRjkUKn.I1LUzcYgWXgFFhta8YQj6', 'Ap #142-2763 Nec Avenue', 'Calle Blancos', '40582', 'India', '1-523-810-1977', '2016-06-17 08:44:31', '2017-11-12 08:43:10'),
(59, 'Ebony', 'Tillman', 'metus.In.nec@dapibusligula.org', '$2y$10$jzBgzcqfQAoWGzKybu/aReOuusudY/XqXamY58EMjcmoMDe8mDIfq', '7989 Maecenas Rd.', 'Glendon', '43-051', 'Honduras', '937-6310', '2016-06-11 06:29:35', '2016-11-24 17:23:49'),
(60, 'Colorado', 'Hahn', 'non.massa.non@Donec.org', '$2y$10$5E9UbMlb38vUyMdr02hpB.CKEbvF5/RfAeGh57MoxdoKD5l17XItC', '965-381 Sed, St.', 'Kufstein', 'K5A 4W7', 'Micronesia', '453-4472', '2016-11-05 11:32:03', '2016-02-26 14:44:55'),
(61, 'Oscar', 'Mooney', 'erat.Vivamus@euaugue.edu', '$2y$10$chywjZRUZV2dtpukyqcd2.L8tjGpwFabirOnIxaq.k8V96nL2ChB2', '215-2111 Tristique St.', 'Saint John', '309722', 'Bhutan', '1-384-147-1906', '2016-03-23 19:10:45', '2016-07-01 01:55:14'),
(62, 'Flynn', 'Gonzales', 'Phasellus.dapibus.quam@venenatisvelfaucibus.com', '$2y$10$J2t2aQxWCn1ixWoIhQsBqOicirqqxZEkyr.Bm4rhRQehsG0zvTWxC', '4757 Maecenas Rd.', 'Täby', 'R0V 5P1', 'Saint Barthélemy', '145-4442', '2017-08-03 10:51:18', '2016-08-07 11:06:00'),
(63, 'Ainsley', 'Owens', 'Ut.tincidunt@nisl.com', '$2y$10$37Hc8jpmVFLSVc/z2nLT2OBdv39SaGdF.AMIl/OsJsGeAWmNFwacm', '5869 Diam. Rd.', 'Recoleta', '70-708', 'Gibraltar', '1-911-291-5882', '2017-11-07 02:05:12', '2017-09-09 00:33:16'),
(64, 'Ivan', 'Randolph', 'eget.varius.ultrices@fringillaeuismodenim.ca', '$2y$10$MUyub1ismYLzDujbTAFdNe.KreDY3PzNXvM7GfimbshCoo4u7g38.', '241-3589 Augue Street', 'Kolmont', 'M1P 4N2', 'South Sudan', '563-2792', '2016-10-17 08:56:23', '2016-02-19 02:52:09'),
(65, 'Irma', 'Chen', 'non@vitaesodalesat.org', '$2y$10$tI6MJfN9OvoYAHEVIHyagenUXJ5uyF5..407cVi3XF7201XsANa4W', 'Ap #784-2876 Elit Road', 'Barnstaple', '01035-753', 'India', '1-368-301-2203', '2017-10-16 22:28:51', '2017-06-06 22:19:05'),
(66, 'Lester', 'York', 'pede@elementumat.com', '$2y$10$6dTocnSX9FTJ6Lb6uJNHF./H04w36SpJ26sRRyyZoKN86CURosuge', '121-5922 Augue Av.', 'Leipzig', '768241', 'Tonga', '1-149-838-5101', '2016-04-21 21:13:49', '2017-04-20 14:39:33'),
(67, 'Armand', 'Santos', 'mauris@sed.ca', '$2y$10$zLmRYlWZVbUR2Ti15XHAd.ZPcoLNzDbfrlIBaW4z/Igwwj4T8Hlou', 'Ap #791-4702 Nec Road', 'Sart-Eustache', '99827', 'Malaysia', '506-6518', '2016-12-08 17:04:09', '2017-09-13 03:32:08'),
(68, 'Zena', 'Figueroa', 'In@tinciduntnibhPhasellus.net', '$2y$10$nOVtlpZ.Irq1xWVhQ.4XqeUNugCDJzg5d2QKybv6VWvE6IaRMrJ/y', '981 Mollis Rd.', 'Pulderbos', '9893', 'Papua New Guinea', '415-4584', '2017-12-03 08:36:33', '2016-09-11 23:51:11'),
(69, 'Kylee', 'Middleton', 'vulputate.risus@montesnascetur.edu', '$2y$10$NiuvUL.Fe3qzlGj2IZDu9.rbANZ9lesQA4SCKLg5vAdMDWQ0Mpsxu', '100-8267 Amet St.', 'Miami', '49-849', 'Canada', '1-166-858-8870', '2017-11-26 18:58:07', '2016-12-07 04:23:58'),
(70, 'Ora', 'Rutledge', 'ante.lectus.convallis@Donec.com', '$2y$10$dccvn6lgtppAu4rVInw3D.7ZZaSPrapTJgXAfHLsJ4Vg61tw7KfA.', '579-3621 Ultrices. Road', 'Prato Carnico', '04398', 'Kiribati', '1-543-810-2800', '2017-09-05 04:16:12', '2017-01-13 13:31:19'),
(71, 'Steel', 'Herring', 'at.arcu@erategetipsum.co.uk', '$2y$10$QUiUDw01JPPJ66BtYEQxiey5ZvQJTbB8P4OnskvXVHqqcpNtEq39m', 'Ap #517-8436 Augue Rd.', 'Nobressart', '121982', 'Haiti', '1-813-366-3262', '2017-04-26 06:15:21', '2016-02-01 05:37:06'),
(72, 'Uma', 'Hull', 'torquent@sitamet.edu', '$2y$10$QdKt8.84s/HZqJQA.cXTFOdmgYxI7y1uxhTfvcO3jP1sCgooQNxa2', 'Ap #985-3728 Ut Avenue', 'Carluke', '73377', 'China', '305-0340', '2016-02-10 21:07:07', '2017-08-16 13:51:42'),
(73, 'Lance', 'Rosario', 'ultricies.sem.magna@Fuscemollis.edu', '$2y$10$57naOElz6hoY10woERO6Cee0mHFVNr7AysHtyfz1QoLi36dXEc1ES', 'Ap #108-825 Enim. Ave', 'Nanton', '99132', 'Isle of Man', '1-564-181-3828', '2017-02-22 19:16:46', '2016-06-23 13:23:46'),
(74, 'Nelle', 'Brady', 'sed.est.Nunc@odio.net', '$2y$10$JNXcumaOaAqpekXKLdHgO.V9ahIDSv1Ixnb7NAcND9FTv2/iZVaAO', '279 Augue Rd.', 'Frankfurt', '21000', 'Tunisia', '1-516-412-6669', '2016-09-20 11:08:07', '2017-11-09 20:13:12'),
(75, 'Ainsley', 'Sampson', 'euismod.in@commodo.edu', '$2y$10$EBVBO7cfRm22bWcZBsLONuYAP5/f2dGZKK34SIiLALGwOjTAzCIwq', '276-7326 Id Avenue', 'Nemi', '07132-227', 'Cook Islands', '632-5334', '2017-12-17 22:44:01', '2016-03-07 04:06:17'),
(76, 'Zahir', 'Reeves', 'Donec@massaVestibulum.co.uk', '$2y$10$iwIc3dbdjNk4HvHd7kNIred3cqL3w5t6E.TBNmz3ifLQrtrEMHs0.', '2449 Tempus Rd.', 'Laramie', '75-844', 'Grenada', '1-813-565-4362', '2017-04-30 16:39:20', '2017-10-20 03:11:59'),
(77, 'Rana', 'Nixon', 'tristique.ac.eleifend@arcu.co.uk', '$2y$10$at0mVduuPKsUPkqzCbPVzugnfLcLyi7ik8ZQTsNBfyQXFwLdHZB/G', 'P.O. Box 600, 6341 Enim, Avenue', 'Jhang', '161469', 'United States', '1-891-297-9565', '2016-11-25 18:25:55', '2016-05-29 05:42:54'),
(78, 'Kyra', 'Davidson', 'molestie.in@rutrumurna.ca', '$2y$10$A7hexI4YM.Qg2ncNzyZ3buYZT.Xk/z04PTN8LyBuPbJcDbwpplMki', '858-2272 Aliquam St.', 'Drogenbos', '50816', 'Bosnia and Herzegovina', '1-499-180-7424', '2017-03-19 21:06:49', '2016-03-16 14:39:07'),
(79, 'Ishmael', 'Ballard', 'arcu@dictummiac.net', '$2y$10$1c0ANhgUYMK2uCFUhkias.fzKw3Qg2oNb4x4dxhfh7xgLK8EBsuQm', 'Ap #916-9446 Phasellus Avenue', 'Tourcoing', '12612', 'Senegal', '318-3585', '2016-12-06 19:53:05', '2016-07-23 18:20:41'),
(80, 'Kathleen', 'Ortega', 'Cras.vulputate.velit@Suspendissesed.org', '$2y$10$4ZypvU72bctl6pDLFUkhj.Xuq5e9abwFKMtY3.Qx5Q6nOlcApPrGq', 'P.O. Box 234, 4539 Nunc. Road', 'Sikar', 'V1H 7W1', 'Kenya', '1-395-397-4486', '2017-04-24 20:20:25', '2017-10-03 15:53:29'),
(81, 'Kaden', 'Lott', 'augue@sapienimperdietornare.org', '$2y$10$frzbpPb0NvrHLwNmLTTMPunpDl/XOTiMTNZ/3XhJ4MRKAk.Eul5Vy', '341-2675 Justo. Av.', 'Isola del Gran Sasso d''Italia', '521207', 'Burkina Faso', '1-511-595-8096', '2016-07-31 21:03:55', '2017-02-14 19:40:12'),
(82, 'Ann', 'Atkinson', 'odio@duiin.edu', '$2y$10$Cj08phl1EZH1cNHxZA6W3.lCHNov1FLLIBSOOHMnbWIQjsD986NrG', 'P.O. Box 116, 3016 Proin Rd.', 'Sirsa', '78366', 'Indonesia', '1-378-508-3277', '2016-12-22 00:23:33', '2017-06-29 12:59:09'),
(83, 'Fiona', 'Rowland', 'odio@cursusnon.com', '$2y$10$h0yHGgaZ3vrAmd82nAAG1.IopZ7RjcIMq/6HPcWL5p2HJzAHCpW12', 'P.O. Box 493, 3941 A, Road', 'Campomarino', '107597', 'Saint Vincent and The Grenadines', '221-5837', '2017-09-24 07:07:44', '2016-08-27 03:40:11'),
(84, 'Hashim', 'Goff', 'Phasellus.fermentum@nostraperinceptos.com', '$2y$10$lzSy19SCbIhSXK04sBIbrO1Yfn2m7AnZHfAGUqo6N00OPGNlneWNu', 'P.O. Box 598, 6083 Nisl. St.', 'Helkijn', '8014XN', 'Hong Kong', '1-707-775-0792', '2016-12-15 10:49:37', '2017-03-09 21:01:43'),
(85, 'Xantha', 'Hodges', 'sagittis.placerat@lacus.co.uk', '$2y$10$AfyrRluJl7WDCVqbRvQRM.rDyhIzN.GCINWCYekbQQG7CPYaKBvh.', 'P.O. Box 214, 489 Libero. Street', 'Santa Cruz de Tenerife', '7037RW', 'Antigua and Barbuda', '1-371-785-3134', '2016-06-28 22:37:50', '2016-02-03 21:42:49'),
(86, 'Heather', 'Nichols', 'est@faucibus.co.uk', '$2y$10$hGLgllUCex./IW8Ep8yP/.zxsj86BVfyifFSvXxvPIsnlZCXJ6oKq', 'P.O. Box 207, 5384 Nulla. St.', 'Belo Horizonte', '72299', 'Mexico', '812-4608', '2016-08-28 09:06:04', '2016-09-11 11:31:47'),
(87, 'Rana', 'Hodge', 'Aenean.massa@posuere.org', '$2y$10$XaxcWF3d5zkQcu/W0Cq69O7ViNu1uSHLYSbu8nMr8haeSpcrUEy9q', '8238 Faucibus Road', 'Beez', '42085', 'Andorra', '921-6548', '2016-09-15 22:46:13', '2017-01-24 16:11:43'),
(88, 'Noah', 'Bryan', 'neque.Morbi.quis@cursus.net', '$2y$10$fQRo3QZ0iXGG9Aqc2qlyVux.1xIyxZttb9qoVEK3fOk2pRurKDkoW', '5744 Dictum. Street', 'Williams Lake', '45349', 'Sweden', '1-879-571-8865', '2016-11-30 13:10:43', '2016-02-15 03:57:16'),
(89, 'Sade', 'Ellison', 'neque.In@eueleifend.ca', '$2y$10$lyvjt0s5RMCpuXLwG46.HuqWv8UCvxKXWB9PvvmAu7xCPgOwb2/PK', 'P.O. Box 790, 5393 Per St.', 'Duncan', '4937', 'Russian Federation', '1-998-453-7034', '2017-03-14 22:51:06', '2017-11-19 18:41:53'),
(90, 'Deirdre', 'Carroll', 'In@mipedenonummy.ca', '$2y$10$Xl0TAREBD9zOd8Q3g6ca0.i2n0UxElkFyIEKmje4DkPYqCiJiQrnO', 'Ap #678-4546 Orci. Av.', 'Montignies-Saint-Christophe', '0486', 'Mali', '1-208-654-3720', '2017-10-11 18:09:11', '2016-11-30 14:30:28'),
(91, 'Brianna', 'Hunter', 'malesuada.malesuada.Integer@necdiamDuis.org', '$2y$10$l5jz34/ypPGPekDhrA9HxOYdKpXpUllpb0v4IXT4UhklWs72gJTSy', '963-4789 Eu, St.', 'Barnstaple', '845357', 'Bosnia and Herzegovina', '829-9805', '2017-02-02 05:26:48', '2016-01-29 08:32:02'),
(92, 'Ralph', 'Osborn', 'dolor.dapibus@lobortismaurisSuspendisse.edu', '$2y$10$fiZJ0dQw7UlVE8C2XsvVm.ulsSL5FIZnMb4j3jt2M8HmOmjxlR.d.', '589-994 Non St.', 'Limbach-Oberfrohna', '78459-872', 'Ethiopia', '496-5252', '2017-12-08 12:07:03', '2017-06-27 12:19:28'),
(93, 'Oren', 'Fleming', 'et.arcu.imperdiet@adipiscinglobortisrisus.edu', '$2y$10$o5FHugLFSlGBEPiNV1uGqeYoxkM9hRL0ysdOfgiKE1NrOg8fDhRPi', 'P.O. Box 873, 5296 Metus. Street', 'Rosolini', '9957AG', 'Northern Mariana Islands', '1-740-669-6420', '2017-10-28 16:59:17', '2017-06-04 05:09:30'),
(94, 'Iola', 'Vance', 'rhoncus.Nullam.velit@sollicitudincommodoipsum.com', '$2y$10$l5RIctsFUsyVmHtTLm6C9ufzBR5/PZVvS8o/rMlPHdoz6gSyXl6YS', 'P.O. Box 766, 7624 Mauris Road', 'Fossato Serralta', '48784', 'United States Minor Outlying Islands', '1-721-519-7374', '2017-11-06 21:06:26', '2017-03-12 07:57:12'),
(95, 'Ima', 'Larson', 'Nunc.ullamcorper.velit@NullafacilisisSuspendisse.ca', '$2y$10$rKVFzKHnJu9VWMnKSkoRv.qX03CzQDcFzfURdtK8B1GhOACBfqCY2', '405-9138 Ac Rd.', 'Guildford', '443409', 'Virgin Islands, British', '1-141-934-8348', '2017-01-19 03:39:23', '2017-08-25 05:29:18'),
(96, 'Logan', 'Roth', 'id@condimentum.edu', '$2y$10$4opSVSsDKYXCG/Aq7diks.2jJbzdbJOseln8I0IJZ/.tNeTB1z95i', '195-9754 Sagittis. Rd.', 'Billings', '824457', 'Saint Lucia', '1-633-302-8585', '2016-03-24 15:19:01', '2017-12-10 15:37:41'),
(97, 'Olga', 'Kelly', 'quis.turpis@nequetellus.net', '$2y$10$T.YVOPXjeH6Yh/EvcVAbTON7jN1A9X3JXuQ1GMpiFjNk1UBUgPh/K', '517-4758 Venenatis Rd.', 'Jamnagar', '37151', 'Nicaragua', '1-603-634-9641', '2017-04-27 15:54:20', '2016-04-25 04:19:34'),
(98, 'August', 'Hodges', 'dapibus@tinciduntDonecvitae.ca', '$2y$10$PFBa8hctbVxI/axIY3vkDeyXgtH6wYoebYH.lbgsteIqwLiS/n59G', 'Ap #447-2100 Egestas Av.', 'Cunco', '5544', 'Madagascar', '1-115-980-1640', '2016-10-12 10:40:58', '2016-01-12 12:35:51'),
(99, 'Minerva', 'Rowe', 'non@dui.net', '$2y$10$oye8nUtbG4ets6v4QFmKt.CsbiY0EZuJM2JxRVvy9JzGGTT39gp1K', 'P.O. Box 536, 3068 Orci Av.', 'Forge-Philippe', '51603', 'Bermuda', '840-8563', '2016-05-16 13:45:32', '2016-01-14 07:19:15'),
(100, 'Bertha', 'Burch', 'eu@faucibus.org', '$2y$10$gUI0IMluwHKvn4n9ehrSse8lTtrtpTxbZgf0wsVD2tJit8u6U/bJW', '2546 Integer Avenue', 'Baileux', '40113', 'Northern Mariana Islands', '1-435-997-9242', '2017-06-18 09:50:06', '2017-09-26 19:14:16'),
(101, 'Bob', 'Snow', 'bobsnow@gmail.com', '$2y$10$3I5G4Oy0P11vqNhOijrdMuMwwsqb89AdtjyvfjwuS5R8zbQ23H6/m', '', '', '', NULL, '-', '2017-02-18 14:45:58', '2017-02-18 14:45:58'),
(102, 'Tom', 'Brown', 'tombrown@gmail.com', '$2y$10$gFxAKIHezl00AcdCBlwwOeXvkuR5DvoWjZEtKSC1zKMPB3HUUJwzy', '', '', '', NULL, '-', '2017-02-18 14:51:34', '2017-02-18 14:51:34'),
(103, 'Shlomi', 'Lahav', 'shlomil.mail@gmail.com', '$2y$10$kW4M98oysfOEymxSV0QdsOOnIEH7qdATS.w.wvasqnd/snKNyqCVG', '', '', '', 'ISRAEL', '+ 972-555555553', '2017-02-20 20:25:39', '2017-02-20 17:33:45');

-- --------------------------------------------------------

--
-- Table structure for table `user_roles`
--

CREATE TABLE `user_roles` (
  `user_id` int(11) NOT NULL,
  `role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `role`) VALUES
(1, 13),
(2, 13),
(3, 13),
(4, 13),
(5, 13),
(6, 13),
(7, 42),
(8, 13),
(9, 13),
(10, 13),
(11, 13),
(12, 13),
(13, 13),
(14, 13),
(15, 13),
(16, 13),
(17, 13),
(18, 13),
(19, 13),
(20, 13),
(21, 13),
(22, 13),
(23, 13),
(24, 13),
(25, 13),
(26, 13),
(27, 13),
(28, 13),
(29, 13),
(30, 13),
(31, 13),
(32, 13),
(33, 13),
(34, 13),
(35, 13),
(36, 13),
(37, 13),
(38, 13),
(39, 13),
(40, 13),
(41, 13),
(42, 13),
(43, 13),
(44, 13),
(45, 13),
(46, 13),
(47, 13),
(48, 13),
(49, 13),
(50, 13),
(51, 13),
(52, 13),
(53, 13),
(54, 13),
(55, 13),
(56, 13),
(57, 13),
(58, 13),
(59, 13),
(60, 13),
(61, 13),
(62, 13),
(63, 13),
(64, 13),
(65, 13),
(66, 13),
(67, 13),
(68, 13),
(69, 13),
(70, 13),
(71, 13),
(72, 13),
(73, 13),
(74, 13),
(75, 13),
(76, 13),
(77, 13),
(78, 13),
(79, 13),
(80, 13),
(81, 13),
(82, 13),
(83, 13),
(84, 13),
(85, 13),
(86, 13),
(87, 13),
(88, 13),
(89, 13),
(90, 13),
(91, 13),
(92, 13),
(93, 13),
(94, 13),
(95, 13),
(96, 13),
(97, 13),
(98, 13),
(99, 13),
(100, 13),
(101, 13),
(102, 13),
(103, 13);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `activations`
--
ALTER TABLE `activations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categore_id` (`user_id`);

--
-- Indexes for table `contents`
--
ALTER TABLE `contents`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menus`
--
ALTER TABLE `menus`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `url` (`url`),
  ADD UNIQUE KEY `id_2` (`id`),
  ADD KEY `url_2` (`url`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `password_resets` (`id`,`migration`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persistences`
--
ALTER TABLE `persistences`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persistences_code_unique` (`code`);

--
-- Indexes for table `preorders`
--
ALTER TABLE `preorders`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categore_id` (`categorie_id`);

--
-- Indexes for table `reminders`
--
ALTER TABLE `reminders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `reminders_user_id_index` (`user_id`),
  ADD KEY `reminders_code_index` (`code`),
  ADD KEY `reminders_completed_index` (`completed`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `user_roles`
--
ALTER TABLE `user_roles`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `activations`
--
ALTER TABLE `activations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `contacts`
--
ALTER TABLE `contacts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `contents`
--
ALTER TABLE `contents`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `country`
--
ALTER TABLE `country`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=240;
--
-- AUTO_INCREMENT for table `menus`
--
ALTER TABLE `menus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `persistences`
--
ALTER TABLE `persistences`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `preorders`
--
ALTER TABLE `preorders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
--
-- AUTO_INCREMENT for table `reminders`
--
ALTER TABLE `reminders`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;
--
-- AUTO_INCREMENT for table `user_roles`
--
ALTER TABLE `user_roles`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `preorders`
--
ALTER TABLE `preorders`
  ADD CONSTRAINT `preorders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`categorie_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
