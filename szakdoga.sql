-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2022. Ápr 05. 09:38
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
(1, '2022-03-24 10:47:46', 2),
(2, '2022-04-05 06:41:39', 2);

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
(3, '2000-10-10', 2800, 'Tta', 'et123'),
(4, '2004-01-30', 2840, 'Oroszlány', 'teszt 12');

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
(2, 'influenza');

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
(2, 2, 'hferi', 'jelszo'),
(3, 4, '', ''),
(4, 5, 'kari', 'kari'),
(5, 1, 'admin', 'admin');

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
(1, 'teszt', 'teszt', 'teszt', 40),
(2, 'teszt2', 'teszt2', 'teszt2', 40),
(3, 'teszt3', 'teszt3', 'teszt3', 100);

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
(2, 3, 1, 1, '2022-04-04', '2022-04-04', 2);

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
(11, 2, 3, '2022-04-04 00:00:00', '2022-04-04 00:00:00');

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
(2, 'Dr.', 'Harsányi', 'Ferenc', 'Róbert', 1),
(3, 'Mr.', 'Sütő', 'Dániel', 'József', 1),
(4, 'Miss', 'Tóth', 'Karina', '', 1),
(5, 'Dr', 'Harsányi', 'László', 'Ferenc', 0);

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
  MODIFY `bel_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT a táblához `beosztas`
--
ALTER TABLE `beosztas`
  MODIFY `beosz_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT a táblához `betegseg`
--
ALTER TABLE `betegseg`
  MODIFY `bet_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT a táblához `gyogyszerek`
--
ALTER TABLE `gyogyszerek`
  MODIFY `gy_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT a táblához `kezeles`
--
ALTER TABLE `kezeles`
  MODIFY `kez_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT a táblához `latogatas`
--
ALTER TABLE `latogatas`
  MODIFY `lat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT a táblához `szemely`
--
ALTER TABLE `szemely`
  MODIFY `szem_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

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
