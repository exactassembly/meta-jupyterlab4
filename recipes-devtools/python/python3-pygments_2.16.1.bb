
SUMMARY = "Pygments is a syntax highlighting package written in Python."
HOMEPAGE = "https://pygments.org/"
AUTHOR = " <Georg Brandl <georg@python.org>>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36a13c90514e2899f1eba7f41c3ee592"

SRC_URI[sha256sum] = "1daff0494820c69bc8941e407aa20f577374ee88364ee10a98fdbe0aece96e29"

PYPI_PACKAGE = "Pygments"

DEPENDS += "\
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
"
