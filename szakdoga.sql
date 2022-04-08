-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2022. Ápr 08. 10:05
-- Kiszolgáló verziója: 10.4.14-MariaDB
-- PHP verzió: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `szakdoga`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `bejelentkezes`
--

CREATE TABLE `bejelentkezes` (
  `bel_id` int(11) NOT NULL,
  `belepes_ido` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `f_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `bejelentkezes`
--

INSERT INTO `bejelentkezes` (`bel_id`, `belepes_ido`, `f_id`) VALUES
(1, '2022-04-08 08:04:21', 7),
(2, '2022-04-08 08:04:28', 4),
(3, '2022-04-08 08:04:32', 6),
(4, '2022-04-08 08:04:39', 13),
(5, '2022-04-08 08:04:44', 1);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `beosztas`
--

CREATE TABLE `beosztas` (
  `beosz_id` int(11) NOT NULL,
  `megnevezes` text COLLATE utf8_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `beosztas`
--

INSERT INTO `beosztas` (`beosz_id`, `megnevezes`) VALUES
(1, 'adminisztrátor'),
(2, 'orvos'),
(3, 'ápoló'),
(4, 'takarító'),
(5, 'recepciós');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `betegek`
--

CREATE TABLE `betegek` (
  `b_id` int(11) NOT NULL,
  `szuletesi_datum` date NOT NULL,
  `iranyitoszam` int(4) NOT NULL,
  `telepules` text COLLATE utf8_hungarian_ci NOT NULL,
  `egyeb_cim` text COLLATE utf8_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `betegek`
--

INSERT INTO `betegek` (`b_id`, `szuletesi_datum`, `iranyitoszam`, `telepules`, `egyeb_cim`) VALUES
(2, '2001-10-11', 2840, 'Oroszlány', 'Rákoczi u. 20'),
(5, '2002-04-20', 2840, 'Oroszlány', 'Táncsics Mihály u. 5.'),
(8, '1954-08-16', 2840, 'Oroszlány', 'Mészáros köz 8.'),
(9, '1980-09-20', 2823, 'Vértessomló', 'Fő utca 70.'),
(10, '2004-04-10', 2823, 'Vértessomló', 'Fő utca 70.'),
(11, '2003-01-02', 2800, 'Tatabánya', 'Győri út 10.'),
(12, '1974-12-12', 2800, 'Tatabánya', 'Környei út 2.');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `betegseg`
--

CREATE TABLE `betegseg` (
  `bet_id` int(11) NOT NULL,
  `megnevezes` text COLLATE utf8_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `betegseg`
--

INSERT INTO `betegseg` (`bet_id`, `megnevezes`) VALUES
(1, 'korona'),
(2, 'Epilepszia'),
(3, 'Perifériás neuropátia'),
(4, 'Gyomor-bél-perforáció'),
(5, 'Köldöksérv');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `dolgozok`
--

CREATE TABLE `dolgozok` (
  `d_id` int(11) NOT NULL,
  `beosz_id` int(11) NOT NULL,
  `felhasznalo` text COLLATE utf8_hungarian_ci NOT NULL,
  `jelszo` text COLLATE utf8_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `dolgozok`
--

INSERT INTO `dolgozok` (`d_id`, `beosz_id`, `felhasznalo`, `jelszo`) VALUES
(1, 2, 'hlaci', 'jelszo'),
(3, 4, '', ''),
(4, 5, 'wife', 'wife'),
(6, 3, 'bea', 'bea'),
(7, 1, 'admin', 'admin'),
(13, 2, 'hferi', 'hferi');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `gyogyszerek`
--

CREATE TABLE `gyogyszerek` (
  `gy_id` int(11) NOT NULL,
  `nev` text COLLATE utf8_hungarian_ci NOT NULL,
  `gyarto` text COLLATE utf8_hungarian_ci NOT NULL,
  `tartalma` text COLLATE utf8_hungarian_ci NOT NULL,
  `mennyiseg` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `gyogyszerek`
--

INSERT INTO `gyogyszerek` (`gy_id`, `nev`, `gyarto`, `tartalma`, `mennyiseg`) VALUES
(1, 'Algoflex', 'Opella Healthcare', 'ibuprofen', 50),
(2, 'Apranax', 'Bausch Health Ireland', 'naproxen', 20),
(3, 'Aspirin', 'Bayer Hungária', 'acetylsalicylic acid', 100),
(4, 'Blocalcin', 'Teva Gyógyszergyár', 'diltiazem', 10),
(5, 'Camelox', 'PannonPharma', 'meloxicam', 2),
(6, 'Cavinton', 'Richter Gedeon', 'vinpocetine', 0);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `kezeles`
--

CREATE TABLE `kezeles` (
  `kez_id` int(11) NOT NULL,
  `b_id` int(11) NOT NULL,
  `bet_id` int(11) NOT NULL,
  `gy_id` int(11) NOT NULL,
  `befekves` date NOT NULL,
  `gyogyulas` date NOT NULL,
  `kezelo_orvos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `kezeles`
--

INSERT INTO `kezeles` (`kez_id`, `b_id`, `bet_id`, `gy_id`, `befekves`, `gyogyulas`, `kezelo_orvos`) VALUES
(1, 2, 1, 1, '2022-02-24', '2022-02-25', 1),
(2, 9, 2, 6, '2022-03-01', '2022-04-01', 1),
(3, 11, 4, 3, '2022-04-05', '2022-04-08', 13);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `latogatas`
--

CREATE TABLE `latogatas` (
  `lat_id` int(11) NOT NULL,
  `l_id` int(11) NOT NULL,
  `b_id` int(11) NOT NULL,
  `bejelentkezes` datetime NOT NULL,
  `tavozas` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `latogatas`
--

INSERT INTO `latogatas` (`lat_id`, `l_id`, `b_id`, `bejelentkezes`, `tavozas`) VALUES
(1, 12, 11, '2022-04-05 10:01:07', '2022-04-05 10:11:07'),
(2, 1, 2, '2022-02-25 10:01:59', '2022-02-25 11:00:00');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `szemely`
--

CREATE TABLE `szemely` (
  `szem_id` int(11) NOT NULL,
  `elotag` text COLLATE utf8_hungarian_ci NOT NULL,
  `vezeteknev` text COLLATE utf8_hungarian_ci NOT NULL,
  `keresztnev` text COLLATE utf8_hungarian_ci NOT NULL,
  `masodik_keresztnev` text COLLATE utf8_hungarian_ci NOT NULL,
  `aktivitas` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `szemely`
--

INSERT INTO `szemely` (`szem_id`, `elotag`, `vezeteknev`, `keresztnev`, `masodik_keresztnev`, `aktivitas`) VALUES
(1, 'Dr.', 'Harsányi', 'László', 'Ferenc', 1),
(2, 'Mr.', 'Orosz', 'Zsolt', '', 1),
(3, 'Mr.', 'Sütő', 'Dániel', '', 1),
(4, 'Miss', 'Tóth', 'Karina', '', 1),
(5, 'Mr.', 'Kulhanek', 'László', 'István', 1),
(6, 'Mrs.', 'Harsányiné', 'Bea', '', 1),
(7, 'Mr.', 'Harsányi', 'László', '', 1),
(8, 'Mrs.', 'Bethlenné', 'Aranka', '', 1),
(9, 'Mr.', 'Forisek', 'János', '', 1),
(10, 'Mr.', 'Forisek', 'János', 'Gergő', 1),
(11, 'Mr.', 'Varga', 'Péter', '', 1),
(12, 'Mr.', 'Varga', 'Péter', '', 1),
(13, 'Dr.', 'Harsányi', 'Ferenc', 'Róbert', 1);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `bejelentkezes`
--
ALTER TABLE `bejelentkezes`
  ADD PRIMARY KEY (`bel_id`),
  ADD KEY `f_id` (`f_id`);

--
-- A tábla indexei `beosztas`
--
ALTER TABLE `beosztas`
  ADD PRIMARY KEY (`beosz_id`);

--
-- A tábla indexei `betegek`
--
ALTER TABLE `betegek`
  ADD PRIMARY KEY (`b_id`);

--
-- A tábla indexei `betegseg`
--
ALTER TABLE `betegseg`
  ADD PRIMARY KEY (`bet_id`);

--
-- A tábla indexei `dolgozok`
--
ALTER TABLE `dolgozok`
  ADD PRIMARY KEY (`d_id`),
  ADD KEY `beosz_id` (`beosz_id`),
  ADD KEY `d_id` (`d_id`);

--
-- A tábla indexei `gyogyszerek`
--
ALTER TABLE `gyogyszerek`
  ADD PRIMARY KEY (`gy_id`);

--
-- A tábla indexei `kezeles`
--
ALTER TABLE `kezeles`
  ADD PRIMARY KEY (`kez_id`),
  ADD KEY `b_id` (`b_id`),
  ADD KEY `bet_id` (`bet_id`),
  ADD KEY `gy_id` (`gy_id`),
  ADD KEY `Kezelő orvos` (`kezelo_orvos`);

--
-- A tábla indexei `latogatas`
--
ALTER TABLE `latogatas`
  ADD PRIMARY KEY (`lat_id`),
  ADD KEY `l_id` (`l_id`),
  ADD KEY `b_id` (`b_id`);

--
-- A tábla indexei `szemely`
--
ALTER TABLE `szemely`
  ADD PRIMARY KEY (`szem_id`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `bejelentkezes`
--
ALTER TABLE `bejelentkezes`
  MODIFY `bel_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT a táblához `beosztas`
--
ALTER TABLE `beosztas`
  MODIFY `beosz_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT a táblához `betegseg`
--
ALTER TABLE `betegseg`
  MODIFY `bet_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT a táblához `gyogyszerek`
--
ALTER TABLE `gyogyszerek`
  MODIFY `gy_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT a táblához `kezeles`
--
ALTER TABLE `kezeles`
  MODIFY `kez_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT a táblához `latogatas`
--
ALTER TABLE `latogatas`
  MODIFY `lat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT a táblához `szemely`
--
ALTER TABLE `szemely`
  MODIFY `szem_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `bejelentkezes`
--
ALTER TABLE `bejelentkezes`
  ADD CONSTRAINT `bejelentkezes_ibfk_1` FOREIGN KEY (`f_id`) REFERENCES `dolgozok` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Megkötések a táblához `betegek`
--
ALTER TABLE `betegek`
  ADD CONSTRAINT `szemely` FOREIGN KEY (`b_id`) REFERENCES `szemely` (`szem_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Megkötések a táblához `dolgozok`
--
ALTER TABLE `dolgozok`
  ADD CONSTRAINT `dolgozok_ibfk_2` FOREIGN KEY (`beosz_id`) REFERENCES `beosztas` (`beosz_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `dolgozok_ibfk_3` FOREIGN KEY (`d_id`) REFERENCES `szemely` (`szem_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Megkötések a táblához `kezeles`
--
ALTER TABLE `kezeles`
  ADD CONSTRAINT `kezeles_ibfk_1` FOREIGN KEY (`b_id`) REFERENCES `betegek` (`b_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kezeles_ibfk_2` FOREIGN KEY (`bet_id`) REFERENCES `betegseg` (`bet_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kezeles_ibfk_3` FOREIGN KEY (`kezelo_orvos`) REFERENCES `dolgozok` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kezeles_ibfk_4` FOREIGN KEY (`gy_id`) REFERENCES `gyogyszerek` (`gy_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Megkötések a táblához `latogatas`
--
ALTER TABLE `latogatas`
  ADD CONSTRAINT `latogatas_ibfk_1` FOREIGN KEY (`l_id`) REFERENCES `szemely` (`szem_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `latogatas_ibfk_2` FOREIGN KEY (`b_id`) REFERENCES `betegek` (`b_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
