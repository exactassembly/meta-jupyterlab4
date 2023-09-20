
SUMMARY = "Style preserving TOML library"
HOMEPAGE = "https://github.com/sdispater/tomlkit"
AUTHOR = " Sébastien Eustace<sebastien@eustace.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

SRC_URI[sha256sum] = "38e1ff8edb991273ec9f6181244a6a391ac30e9f5098e7535640ea6be97a7c86"

PYPI_PACKAGE = "tomlkit"

DEPENDS += "\
    python3-poetry-core-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
"

BBCLASSEXTEND = "native nativesdk"