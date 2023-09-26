
SUMMARY = "IPython: Productive Interactive Computing"
HOMEPAGE = "https://ipython.org"
AUTHOR = "The IPython Development Team <ipython-dev@python.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96c7b03c4a9d8babd9ec57b1f0613d78"

SRC_URI[sha256sum] = "2baeb5be6949eeebf532150f81746f8333e2ccce02de1c7eedde3f23ed5e9f1e"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-backcall \
    ${PYTHON_PN}-decorator \
    ${PYTHON_PN}-jedi \
    ${PYTHON_PN}-matplotlib-inline \
    ${PYTHON_PN}-pickleshare \
    ${PYTHON_PN}-prompt-toolkit \
    ${PYTHON_PN}-pygments \
    ${PYTHON_PN}-stack-data \
    ${PYTHON_PN}-traitlets \
"