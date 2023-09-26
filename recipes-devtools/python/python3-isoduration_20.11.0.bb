SUMMARY = "Operations with ISO 8601 durations"
HOMEPAGE = "https://github.com/bolsote/isoduration"
AUTHOR = "Víctor Muñoz<victorm@marshland.es>"
LICENSE = "ISCL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3a2f086f31826f64c46f8b519e5dfc4"

SRC_URI[sha256sum] = "ac2f9015137935279eac671f94f89eb00584f940f5dc49462a0c4ee692ba1bd9"

PYPI_PACKAGE = "isoduration"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"