SUMMARY = "Jupyter Python Comm implementation, for usage in ipykernel, xeus-python etc."
HOMEPAGE = ""
AUTHOR = "Jupyter contributors <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3a623b76c23287751590a7793a86e552"

SRC_URI[sha256sum] = "354e40a59c9dd6db50c5cc6b4acc887d82e9603787f83b68c01a80a923984d15"

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
    python3-packaging \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-traitlets \
"

BBCLASSEXTEND = "native nativesdk"
