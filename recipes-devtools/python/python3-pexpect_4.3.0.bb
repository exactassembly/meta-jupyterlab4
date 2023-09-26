SUMMARY = "Pexpect allows easy control of interactive console applications."
HOMEPAGE = "https://pexpect.readthedocs.io/"
AUTHOR = " Noah Spurrier; Thomas Kluyver; Jeff Quast <noah@noah.org>"
LICENSE = "ISCL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c7a725251880af8c6a148181665385b"

SRC_URI[sha256sum] = "00ab0872f80f5db740499e7a1283a7c3b97bea542d72df84d83dea17d0afd2d9"

PYPI_PACKAGE = "pexpect"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"