
SUMMARY = "Tornado websocket backend for the Xterm.js Javascript terminal emulator library."
HOMEPAGE = "https://github.com/jupyter/terminado"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a18f7d4f3c3e947ebf8b082f478e62b2"

SRC_URI[sha256sum] = "6ccbbcd3a4f8a25a5ec04991f39a0b8db52dfcd487ea0e578d977e6752380333"


PYPI_PACKAGE = "terminado"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-tornado \
"